import sys
import math

__author__ = 'catherinekabanova'


def simple_radix_sort(array):
    max_length = -1
    for number in array:
        number_len = int(math.log10(number)) + 1
        if number_len > max_length:
            max_length = number_len
    buckets = [[] for i in range(0, 10)]
    for digit in range(0, max_length):
        for number in array:
            buckets[(number // 10**digit) % 10].append(number)
        del array[:]
        for bucket in buckets:
            array.extend(bucket)
            del bucket[:]
    return array


def radix_sort(array):
    positive_array = []
    negative_array = []
    for number in array:
        if number >= 0:
            positive_array.append(number)
        else:
            negative_array.append(abs(number))
    if negative_array:
        negative_array = simple_radix_sort(negative_array)
        for i in range(len(negative_array)):
                negative_array[i] *= -1
        negative_array.reverse()
    if positive_array:
        positive_array = simple_radix_sort(positive_array)
    return negative_array + positive_array

if __name__ == '__main__':
    array_of_elements = [int(k) for k in sys.stdin.readline().split(' ')]
    radix_sort(array_of_elements)
    for i in range(0, len(array_of_elements)):
        sys.stdout.write(str(radix_sort(array_of_elements)[i]) + ' ')

