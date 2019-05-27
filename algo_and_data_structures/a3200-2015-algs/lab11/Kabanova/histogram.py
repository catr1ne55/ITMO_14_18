import sys


def max_square(array):
    max_elem = array[0]
    square = 0
    maxsquare = 0
    if len(array) == 1:
        return 0
    else:
        for i in range(1, len(array)):
            if max_elem <= array[i]:
                if square > maxsquare:
                    maxsquare = square
                square = 0
                max_elem = array[i]
            else:
                square += max_elem - array[i]
    return maxsquare

if __name__ == "__main__":
    array_of_elements = [int(k) for k in sys.stdin.readline().split(' ')]
    sys.stdout.write(str(max_square(array_of_elements)))



