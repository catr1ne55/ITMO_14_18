import numpy as np


def find_b(x, y):
    trans_x = np.transpose(x)
    if np.linalg.det(trans_x.dot(x)) == 0:
        return None
    else:
        return np.linalg.inv((trans_x.dot(x))).dot(trans_x).dot(y)


def lin_regr(x, y):
    n = x.shape[0]
    x_matrix = np.ones(shape=(n, 2))
    for i in range(n):
        x_matrix[i][1] = x[i]
    b = find_b(x_matrix, y)

    def func(x):
        f = b[0]
        for i in range(1, len(b)):
            f += b[i] * x[i]
            return f


def polynom_regr(x, y, deg):
    n = x.shape[0]
    x_matrix = np.ones(shape=(n, deg + 1))
    for i in range(n):
        for j in range(1, deg + 1):
                x_matrix[i][j] = x[i]*j
    b = find_b(x_matrix, y)

    def func(x):
        f = b[0]
        for i in range(1, len(b)):
            f += b[i] * (x[i] ** i)
            return f


def non_lin_regr(x, y, funcs):
    n = x.shape[0]
    x_matrix = np.ones(shape=(n, len(funcs) + 1))
    for i in range(n):
        for j in range(1, len(funcs) + 1):
            x_matrix[i][j] = funcs[j - 1](x[i])
    b = find_b(x_matrix, y)

    def func(funcs):
        f = b[0]
        for i in range(1, len(b)):
            f += b[i] * funcs[i]
            return f