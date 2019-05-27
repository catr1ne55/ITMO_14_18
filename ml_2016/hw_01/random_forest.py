import numpy as np



class CART:
    def __init__(self):
        pass

    def fit(self, x, y):
        #x- матрица np.ndarray; y - вектор-столбец np.ndarray
        #x = preprocess(x_0) x_0 - исходная матрица

        pass

    def predict(self, x):
        #
        pass


class Node:
    def __init__(self):
        self.rule = None
        self.right = None
        self.left = None


def preprocess(x):
    x_preprocessed = []
    for i in range(x.ndim):
        current = x[i]
        current.sort()
        cur_list = []
        for j in current:
            cur_list.append(f[i] > j)
        x_preprocessed.append(cur_list)
    x_preprocessed_matrix = np.array(x_preprocessed)
    return x_preprocessed_matrix