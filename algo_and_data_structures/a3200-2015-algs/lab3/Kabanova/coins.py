import sys
first_line = sys.stdin.readline()
second_line = sys.stdin.readline()
number = int(first_line)
array_coins = [int(k) for k in second_line.split(' ')]


def methods(quantum, n, coins):
    if quantum == 0:
        return 1
    elif quantum < 0 or n == 0:
        return 0
    else:
        return methods(quantum, n - 1, coins) + methods(quantum - coins[n - 1], n, coins)

sys.stdout.write(str(methods(number, len(array_coins), array_coins)))


