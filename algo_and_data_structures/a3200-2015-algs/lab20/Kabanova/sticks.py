import sys


def max_square(number_of_sticks, sticks):
    if number_of_sticks < 4:
        return 0
    else:
        sticks.sort()
        sticks.reverse()
        max_sq = 0
        max_stick = 0
        i = 1
        while i < len(sticks):
            if sticks[i - 1] - sticks[i] <= 1:
                if max_stick == 0:
                    max_stick = sticks[i]
                    i += 1
                else:
                    max_sq += max_stick * sticks[i]
                    max_stick = 0
                    i += 1
            i += 1
        return max_sq

if __name__ == "__main__":
    first_line = int(sys.stdin.readline())
    second_line = [int(i) for i in sys.stdin.readline().split()]
    sys.stdout.write(str(max_square(first_line, second_line)))



