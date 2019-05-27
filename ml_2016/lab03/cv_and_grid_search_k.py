from knn import *


def cv(num, percent, dataset, kNN,  k, num_of_classes, n, distance):
    errors = []
    l = 0
    while l < num:
        err = 0
        train_data, test_data = split_data(dataset, percent)
        result = kNN(train_data, test_data, k, num_of_classes, n, distance)
        target = []
        for j in range(len(test_data)):
            target.append(test_data[j][1])
        for i in range(len(result)):
            if result[i] != target[i]:
                err += 1
        err /= len(target)
        errors.append(err)
        l += 1
    err_res = sum(errors)/n
    return err_res


def grid_search(train_data, test_data, num_of_classes, n, distance):
    start = 0
    new_k = 0
    for j in range(50):
        for k in range(50):
            res = kNN(train_data, test_data, k, num_of_classes, n, distance)
            target = []
            for i in range(len(test_data)):
                target.append(test_data[i][1])
            acc = accuracy(res, target)
            if acc > start:
                start = acc
                new_k = k
    return new_k


def accuracy(model, target):
    err = 0
    for i in range(len(model)):
        if model[i] != target[i]:
           err += 1
    err /= len(model)
    return 1 - err