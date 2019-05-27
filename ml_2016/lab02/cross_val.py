from random import shuffle
import numpy as np


def cv(dataset, k, model, q, n): #dataset - исходные данные, k - размер выборки для обучения, model - алгоритм для обучения, q - функция ошибки, n - кол-во разбиений
    err = []
    l = 0
    while l < n:
        shuffle(dataset)
        x_train_set = [dataset[i][0] for i in range(k)]
        x_test_set = [dataset[i][0] for i in range(k, len(dataset))]
        y_train_set = [dataset[i][1] for i in range(k)]
        y_test_set = [dataset[i][1] for i in range(k, len(dataset))]
        func = model(x_train_set, y_train_set)
        y_test_res = []
        for i in range(k):
            y_test_res.append(func(x_test_set[i][0]))
        err.append(q(y_test_res, y_test_set))
        l += 1
    err_res = sum(err)/n
    return err_res


def q(y_model, y):
    y_diff = y_model - y
    y_diff_trans = np.transpose(y_diff)
    return np.dot(y_diff_trans, y_diff)


def k_fold(dataset, k, model, q): #dataset - исходные данные, k - кол-во частей, model - алгоритм для обучения, q - функция ошибки
    err = []
    l = 0
    new_dataset = []
    i = 0
    one_part_contains = len(dataset) // k
    while i < len(dataset) - one_part_contains:
        one_part = []
        for j in range(one_part_contains):
            one_part.append(dataset[i + j])
        new_dataset.append(one_part)
        i += one_part_contains
    last_part = []
    for s in range(len(dataset) - one_part_contains, len(dataset)):
        last_part.append(dataset[s])
    new_dataset.append(last_part)
    x_train_set = []
    y_train_set = []
    while l < k + 1:
        for i in range(k):
            if i != l:
                x_train_set.append(new_dataset[i][0])
                y_train_set.append(new_dataset[i][1])
        x_test_set = new_dataset[l][0]
        y_test_set = new_dataset[l][1]
        func = model(x_train_set, y_train_set)
        y_test_res = []
        for i in range(k):
            y_test_res.append(func(x_test_set[i][0]))
        err.append(q(y_test_res, y_test_set))
        l += 1
    err_res = sum(err)/k
    return err_res


def m_c(dataset, k, model, q, n): #dataset - исходные данные, k - размер выборки для обучения, model - алгоритм для обучения, q - функция ошибки, n - кол-во разбиений
    err = []
    l = 0
    x_train_set = []
    y_train_set = []
    while l < n:
        for i in range(k):
            x_train_set.append(dataset[i][0])
            y_train_set.append(dataset[i][1])
            shuffle(dataset)
        x_test_set = [dataset[i][0] for i in range(k, len(dataset))]
        y_test_set = [dataset[i][1] for i in range(k, len(dataset))]
        func = model(x_train_set, y_train_set)
        y_test_res = []
        for i in range(k):
            y_test_res.append(func(x_test_set[i][0]))
        err.append(q(y_test_res, y_test_set))
        l += 1
    err_res = sum(err)/n
    return err_res