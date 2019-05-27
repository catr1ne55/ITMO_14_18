{-# LANGUAGE RecordWildCards #-}
                                 -- they make your code clean and clear.
                                 -- Read about this extension here:
                                 -- https://ocharles.org.uk/blog/posts/2014-12-04-record-wildcards.html



module Construction.Internal.Functions
  ( Context (..)        -- make restrictions is good practice. As you can see here,
  , fresh, free, bound  -- we make "public" not all functions, but only Context, fresh, ...
  , reduce, substitute, alpha, beta, eta, equal, normal
  )where

import           Construction.Internal.Types (Name, Term (..))
import           Data.Set                    (Set, delete, empty, insert,
                                              member, notMember, singleton,
                                              union)
import           Data.Text                   (pack)


-- Context is just set of names that are in our context.
type Context = Set Name

-- | @fresh@ generates new variable different from every variables in set.
fresh :: Set Name -> Name
fresh conflicts = head . dropWhile (`member` conflicts) $ nameGen -- This is ugly name generator. Make it better.
  where nameGen = [pack $ 'x' : show ind | ind <- [0..] :: [Int]]

-- | @free@ finds all free (Amazing!) variables from given term.
free :: Term -> Set Name
free Var{..} = singleton var
free App{..} = free algo `union` free arg
free Lam{..} = variable `delete` free body

-- | @bound@ finds all bounded variables from given term.
-- This function uses RecordWildCards.
-- If you like it refactor @free@ function.
bound :: Term -> Set Name
bound Var{}   = empty
bound App{..} = bound algo `union` bound arg
bound Lam{..} = variable `insert` bound body

-- a[n := b] - substitution
substitute :: Term -> Name -> Term -> Term
substitute v@Var{..} n b | var == n  = b
                         | otherwise = v
substitute App{..} n b = App (substitute algo n b) (substitute arg n b)
substitute l@Lam{..} n b |variable == n = l
                         |notMember variable freeb = Lam variable (substitute body n b)
                         |member variable freeb = substitute (alpha l freeb) n b
                                    where freeb = free b

-- | alpha reduction
alpha :: Term -> Set Name -> Term
alpha v@Var{..} names = v
alpha App{..} names = App (alpha algo names) (alpha arg names)
alpha l@Lam{..} names |notMember variable names = Lam variable (alpha body names)
                      |otherwise = Lam variable1 (alpha (substitute body variable (Var (variable1))) names)
                                 where variable1 = fresh (union names (free l))

-- | beta reduction
beta :: Term -> Term
beta (App Lam{..} arg) = substitute (beta body) variable (beta arg)
beta App{..} = App (beta algo) (beta arg)
beta Lam{..} = Lam variable (beta body)
beta term = term

-- | eta reduction
eta :: Term -> Term
eta l@(Lam v1 (App algo (Var v2))) | (v1 == v2) && (notMember v1 (free algo)) = algo
                                   | otherwise = l
eta term = term

-- | reduce term
reduce :: Term -> Term
reduce term = let term' = beta term
          in if term' == term
                 then eta term
                 else reduce term'

-- | equality check
equal :: Term -> Term -> Bool
equal (Var v1) (Var v2) | v1 == v2 = True
                        | otherwise = False
equal a1@(App algo1 arg1) a2@(App algo2 arg2) | (algo1 == algo2) && (arg1 == arg2) = True
                                              | otherwise = equal (reduce a1) (reduce a2)
equal (Lam var1 body1) (Lam var2 body2) | var1 == var2 = equal (reduce body1) (reduce body2)
                                        | otherwise = equal (reduce body1) (reduce (substitute body2 var2 (Var var1)))
equal _ _ = False

equalRedex :: Term -> Bool
equalRedex term | equal redex term = True
                | otherwise = equalRedex redex where
                                         redex = beta term
-- | normal form check
normal :: Term -> Bool
normal v@Var{..} = True
normal a@App{..} = equalRedex a
normal l1@Lam{..} = equalRedex l1
normal _  = False
