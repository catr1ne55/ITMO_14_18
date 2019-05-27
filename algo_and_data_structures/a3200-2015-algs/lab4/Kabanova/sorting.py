import sys


line = sys.stdin.readline()
list_of_elements = [int(k) for k in line.split(' ')]

k = 10


def merge(elements, start, middle, end):
    end_l = middle - start
    end_r = end - middle
    list_l = []
    list_r = []
    for i in range(0, end_l + 1):
        list_l.append(elements[start + i])
    for j in range(0, end_r):
        list_r.append(elements[middle + j + 1])
    list_l.append(2015 ** 10)
    list_r.append(2015 ** 10)
    i = 0
    j = 0
    for k in range(start, end):
        if list_l[i] <= list_r[j]:
            elements[k] = list_l[i]
            i += 1
        else:
            elements[k] = list_r[j]
            j += 1


def merge_sort(elements, start, end):
    if end - start + 1 > k:
        middle = (start + end) // 2
        merge_sort(elements, start, middle)
        merge_sort(elements, middle, end)
        merge(elements, start, middle + 1, end)
    else:
        insertion_sort(elements)
    return elements


def insertion_sort(elements):
    for j in range(2, len(elements)):
        key = elements[j]
        i = j - 1
        while i > 0 and elements[i] > key:
            elements[i + 1] = elements[i]
            i -= 1
        elements[i + 1] = key
    return elements


def combine_sorting(elements):
    if len(elements) < k:
        insertion_sort(elements)
    else:
        merge_sort(elements, 0, len(elements) - 1)


combine_sorting(list_of_elements)
for i in range(0, len(list_of_elements)):
    sys.stdout.write(str(list_of_elements[i]) + ' ')

