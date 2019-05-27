{-# LANGUAGE GADTs             #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE TypeFamilies      #-}

module Tasks.GADT_1.GADTParser where

import           Data.Text              (pack)
import           Tasks.GADT_1.GADTExpr
import           Text.Parsec.Char       (char, digit, space, string)
import           Text.Parsec.Combinator (between, many1)
import           Text.Parsec.Language   (haskellDef)
import           Text.Parsec.Prim       (many, parseTest, try, (<|>))
import           Text.Parsec.Text       (Parser)
import           Text.Parsec.Token

tempP :: Parser a -> Parser a
tempP p = try $ spacedP $ p

iLitP :: Parser (Lit Int)
iLitP = tempP $ ILit <$> read <$> (many1 digit)

charToBool :: Char -> Bool
charToBool 'T' = True
charToBool 'F' = False

bLitP :: Parser (Lit Bool)
bLitP = tempP $ BLit <$> charToBool <$> (char 'T' <|> char 'F')

iiLitP :: Parser (Expr Int)
iiLitP = Lit <$> iLitP

bbLitP :: Parser (Expr Bool)
bbLitP = Lit <$> bLitP

addP :: Parser (Expr Int)
addP = Add <$> (((tryP [iiLitP]) <|> (tryBracketP [addP, iiLitP])) <* char '+') <*> parse

leqP :: Parser (Expr Bool)
leqP = Leq <$> (parse <* char '<') <*> parse

andP :: Parser (Expr Bool)
andP = And <$> (((tryP [leqP, bbLitP]) <|> (tryBracketP [leqP, bbLitP, andP])) <* string "&&") <*> parse

spacedP :: Parser a -> Parser a
spacedP p = (many space *> p) <* many space

bracketP :: Parser a -> Parser a
bracketP p = (try $ spacedP $ between (char '(') (char ')') $ p) <|> (try $ spacedP $ between (char '(') (char ')') $ (bracketP p))

tryP :: [Parser a] -> Parser a
tryP (x:[]) = try x
tryP (x:xs) = try x <|> (tryP xs)

tryBracketP :: [Parser a] -> Parser a
tryBracketP (x:[]) = try (bracketP x)
tryBracketP (x:xs) = try (bracketP x) <|> (tryBracketP xs)

tryNbracket :: [Parser a] -> Parser a
tryNbracket = \x -> (tryP x)  <|> (tryBracketP x)

class MyParse a where
  parse :: Parser (Expr a)

instance MyParse Int where
  parse = tryNbracket [addP, iiLitP]
instance MyParse Bool where
  parse = tryNbracket [andP, leqP, bbLitP]
