import sys


def find_triples(array):
    number_of_triples = 0
    array.sort()
    length = len(array)
    for i in range(0, length):
        array[i] = array[i]*array[i]
    for i in range(0, length):
        j = 0
        k = i
        while j != k:
            if array[j] + array[k] == array[i]:
                number_of_triples += 1
                k -= 1
            else:
                if array[j] + array[k] < array[i]:
                    j += 1
                else:
                    k -= 1
    return number_of_triples


if __name__ == "__main__":
    array_of_elements = [int(k) for k in sys.stdin.readline().split(' ')]
    sys.stdout.write(str(find_triples(array_of_elements)))
