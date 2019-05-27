import numpy as np
import math


def distance_evkl(x, y, n):
    dist = 0
    for i in range(n):
        dist += (x[i] - y[i]) ** 2
    return math.sqrt(dist)


def distance_mnht(x, y, n):
    dist = 0
    for i in range(n):
        dist += abs(x[i] - y[i])
    return dist


def split_data(data, percent):
    train_data = []
    test_data = []
    train_size = int(len(data)*(1-percent/100))
    for i in range(train_size):
        train_data.append(data[i])
    for j in range(train_size, len(data)):
        test_data.append(data[j])
    return train_data, test_data


def kNN(train_data, test_data, k, num_of_classes, n, dist):
    #train_data - данные с размеченными классами, test_data - данные, класс которых не известен,
    #k - кол-во соседей, num_of_classes - кол-во классов, n - размерность пространства иксов, dist - метрика
    #print(test_data)
    predict_class = []
    for l in range(len(test_data)):
        distances = [[dist(test_data[l][0], train_data[i][0], n), train_data[i][1]] for i in range(len(train_data))]
        distances.sort()
        #print(distances)
        classes = np.zeros(num_of_classes)
        for j in range(k):
            classes[distances[j][1]] += 1
        #print("Classes", classes)
        class_max = max(classes)
        #print("MAX", class_max)
        s = 0
        while classes[s] != class_max:
            s += 1
        predict_class.append(s)
    return predict_class


def weighted_kNN(train_data, test_data, k, num_of_classes, n, dist, param):
    # train_data - данные с размеченными классами, test_data - данные, класс которых не известен,
    # k - кол-во соседей, num_of_classes - кол-во классов, n - размерность пространства иксов,
    # dist - метрика, param - параметр для расчета весов
    predict_class = []
    for l in range(len(test_data)):
        distances = [[dist(test_data[l][0], train_data[i][0], n), train_data[i][1], 1] for i in range(len(train_data))]
        for i in range(len(train_data)):
            if dist(test_data[l][0], train_data[i][0], n) != 0:
                distances[i][2] = param / dist(test_data[l][0], train_data[i][0], n)
            else:
                distances[i][2] = 0
        distances.sort()
        classes = np.zeros(num_of_classes)
        for j in range(k):
            classes[distances[j][1]] += distances[j][2]
        class_max = max(classes)
        s = 0
        while classes[s] != class_max:
            s += 1
        predict_class.append(s)
    return predict_class