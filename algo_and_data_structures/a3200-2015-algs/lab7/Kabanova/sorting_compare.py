from random import randint
from time import time

import pylab

from mergesort import combine_sorting
from quicksort import quick_sort
from radixsort import radix_sort


def generate_random_array(lo, hi, size):
    answer = [randint(lo, hi) for i in range(size)]
    for i in range(1, size):
        if randint(0, 1000000) < 30000:
            answer[randint(0, i)] = answer[i - 1]
    return answer


def positive_and_negative(s):
    return generate_random_array(-1000000, 1000000, s)


def positive(s):
    return generate_random_array(0, 10000, s)


def partially_sorted(s):
    hi = 10000
    answer = [0 for i in range(s)]
    answer[0] = randint(0, hi)
    for i in range(1, s):
        if randint(0, 1000000) < 30000:
            answer[i] = answer[i - 1]
        else:
            answer[i] = (answer[i - 1] + randint(0, hi)) % hi
    return answer


def ascending_sorted(s):
    answer = [0 for i in range(s)]
    answer[0] = randint(0, 10000)
    for i in range(1, s):
        if randint(0, 1000000) < 30000:
            answer[i] = answer[i - 1]
        else:
            answer[i] = answer[i - 1] + randint(0, (10000 - answer[i - 1]) // 10)
    return answer


def descending_sorted(s):
    answer = ascending_sorted(s)
    answer.reverse()
    return answer


def unique_number(s):
    number = randint(-1000000, 1000000)
    return [number for i in range(s)]


root = "/"
parts = __file__.split('/')
for i in range(1, len(parts) - 3):
    root += parts[i] + '/'


def grade(sort_func, array_generator, size):
    mil = 0.0
    for i in range(5):
        array = array_generator(size)
        t1 = time()
        sort_func(array)
        t2 = time()
        mil += t2 - t1
    mil /= 5.0
    return mil


sort_functions = {"Quick": quick_sort,
                  "Merge": combine_sorting,
                  "Radix": radix_sort,
                  "Sort": sorted}

generators = {"Array of random integers from [-1e6, 1e6]": positive_and_negative,
              "Array of random inegerts from [0, 1e4]": positive,
              "Array with some sorted subarrays": partially_sorted,
              "Already sorted array": ascending_sorted,
              "Descending sorted array": descending_sorted,
              "Array with the only distinct element": unique_number}

if __name__ == "__main__":

    sizes = [100 + 100000 * i for i in range(6)]
    cur = 1

    for gen_name, gen in generators.items():
        pylab.subplot(2, 3, cur)
        pylab.xlabel("size, elements")
        pylab.ylabel("time, sec")
        print("Now passing: %s" % gen_name)
        for func_name, func in sort_functions.items():
            millis = []
            for size in sizes:
                millis.append(grade(func, gen, size))
                print("\tUsing %s on array of size %s" % (func_name, size))
            print("\t***\n\n")
            pylab.plot(sizes, millis, label=func_name)
        pylab.title(gen_name)
        pylab.legend(loc='upper left', title="Sorts")
        cur += 1

    pylab.show()
