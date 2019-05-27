def sieve(n):
    pros = [True for i in range(n + 1)]
    pros[0] = False
    pros[1] = False
    for i in range(2, n + 1):
        if pros[i]:
            for k in range(2, n + 1):
                if i * k < (n + 1):
                    pros[i * k] = False
    return pros

print sieve(10)
