from urllib3.connectionpool import xrange

__author__ = 'catherinekabanova'


def d_l_distance(first_word, second_word):
    distance = {}
    len_1 = len(first_word)
    len_2 = len(second_word)
    for i in xrange(-1, len_1 + 1):
        distance[(i, -1)] = i + 1
    for j in xrange(-1, len_2 + 1):
        distance[(-1, j)] = j + 1
    for i in xrange(len_1):
        for j in xrange(len_2):
            if first_word[i] == second_word[j]:
                difference = 0
            else:
                difference = 1
            distance[(i, j)] = min(distance[(i - 1, j)] + 1, distance[(i, j - 1)] + 1, distance[(i - 1, j - 1)] + difference)
            if i and j and first_word[i] == second_word[j - 1] and first_word[i - 1] == second_word[j]:
                distance[(i, j)] = min(distance[(i, j)], distance[i - 2, j - 2] + difference)
    return distance[len_1 - 1, len_2 - 1]

