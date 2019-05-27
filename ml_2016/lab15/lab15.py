import numpy as np
import random


def genetic_alg(func, n, k):
    # create population
    population = []
    for i in range(k):
        population.append(np.random.randint(2, size=n))
        #print(population[i])
    #print(population)
    stop = 0
    while stop < 10:
        # create pairs
        pairs = []
        s = 0
        while s < k:
            indexes = np.random.choice(len(population), size=2, replace=False)
            # print(indexes)
            pairs.append([population[indexes[0]], population[indexes[1]]])
            s += 1
        #for i in range(len(pairs)):
            #print(pairs[i])
        # crossing over
        x_child = crossing_over_1(pairs, n)
        population += x_child
        #print(population)
        # mutation
        mutants = mutate(population, n)
        population += mutants
        #print(population)
        # calculate func
        y_array = []
        for l in range(len(population)):
            y_array.append(func(population[l], n))
        #print(y_array)
        # best selection
        new = []
        min_y = max(y_array)
        for d in range(len(y_array)):
            if y_array[d] <= min_y:
                min_y = y_array[d]
                new.append(population[d])
        population = new
        stop += 1
    y_final = []
    for l in range(len(population)):
        y_final.append(func(population[l], n))
    min_y_f = min(y_final)
    index = 0
    for i in range(len(y_final)):
        if y_final[i] == min_y_f:
            index = i
            break
    print(population[index])


def crossing_over_1(pairs, n):
    new_generation = []
    s = n // 2
    for i in range(len(pairs)):
        new_1 = [pairs[i][0][j] for j in range(s)]
        new_2 = [pairs[i][1][l] for l in range(s, n)]
        new = new_1 + new_2
        new_generation.append(np.array(new))
    #print(new_generation)
    return new_generation


def mutate(generation, n):
    mutants = []
    for i in range(len(generation)):
        j = random.randint(0, n - 1)
        if generation[i][j] != 0:
            mutant = generation[i]
            mutant[j] = 0
            mutants.append(mutant)
    return mutants