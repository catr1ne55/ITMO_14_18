import random
import sys

line = sys.stdin.readline()
array_of_elements = [int(k) for k in line.split(' ')]


def quick_sort(elements, start, end):
    if start < end:
        middle = random_partition_quick_sort(elements, start, end)
        quick_sort(elements, start, middle - 1)
        quick_sort(elements, middle + 1, end)
    return elements


def partition_quick_sort(elements, start, end):
    x = elements[end]
    i = start - 1
    for j in range(start, end):
        if elements[j] <= x:
            i += 1
            swap(elements, i, j)
    swap(elements, i + 1, end)
    return i + 1


def random_partition_quick_sort(elements, start, end):
    random_int = random.randint(start, end)
    swap(elements, end, random_int)
    return partition_quick_sort(elements, start, end)


def swap(array, i, j):
    middle = array[i]
    array[i] = array[j]
    array[j] = middle
    return array

quick_sort(array_of_elements, 0, len(array_of_elements) - 1)
for i in range(0, len(array_of_elements)):
    sys.stdout.write(str(array_of_elements[i]) + ' ')

