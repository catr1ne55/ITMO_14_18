import numpy as np
import math


class AdaBst:
    def __init__(self, x, y, weak_learners, k, stop):
        self.x = x
        self.y = y
        self.weak_learners = weak_learners
        self.weights = []
        self.num_of_f = k
        self.stop = stop
        self.alphas = []

    def init_weights(self):
        for i in range(self.num_of_f):
            self.weights.append(1/len(self.x))

    def boost(self, q):
        self.init_weights()
        while not self.stop:
            for i in range(self.num_of_f):
                n_list = []
                for i in range(self.num_of_f):
                    n_list.append(q(self.weak_learners[i], self.x, self.y, self.weights))
                self.weak_learners[i] = self.weak_learners[np.argmin(n_list)]
                n = q(self.weak_learners[i], self.x, self.y, self.weights)
                alpha = 0.5 * math.log((1 - n) / n)
                self.alphas.append(alpha)
            sum_weights = 0
            for i in range(len(self.x)):
                self.weights[i] = math.exp(-self.alphas[i] * self.y[i] * self.weak_learners[i](self.x[i]))
                sum_weights += self.weights[i]
            for i in range(len(self.x)):
                self.weights[i] /= sum_weights
        return (self.alphas, self.weak_learners)


def q(weak_learner, x, y, weights):
    err = 0
    for i in range(len(weak_learner)):
        if weak_learner(x[i]) == y[i]:
            err += np.dot(weights[i], weak_learner(x[i]))
    return err


