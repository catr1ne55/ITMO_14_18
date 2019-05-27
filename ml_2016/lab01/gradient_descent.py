import math
import random
import numpy as np


def norma(x_1, x_2, n):
    if n == 1:
        return abs(x_1 - x_2)
    else:
        sum_x = 0
        for i in range(n):
            sum_x += (x_1[i] - x_2[i]) ** 2
        return math.sqrt(sum_x)


def grad_des_1(n, f, grad_f, x_0, l, e):
    x_1 = x_0 - l * grad_f(x_0)
    if norma(x_1, x_0, n) > e:
        return grad_des_1(n, f, grad_f, x_1, l, e)
    else:
        return x_1


def grad_des_2(n, f, grad_f, x_0, l, e):
    x_1 = x_0 - l * grad_f(x_0)
    if norma(x_1, x_0, n) > e:
        l *= 0.9999
        return grad_des_2(n, f, grad_f, x_1, l, e)
    else:
        return x_1


def grad_des_3(n, f, grad_f, start, end, x_0, e):
    l = dichotomy(n, f, grad_f, start, end, x_0, e)
    x_1 = x_0 - l * grad_f(x_0)
    if norma(x_1, x_0, n) > e:
        return grad_des_3(n, f, grad_f, start, end, x_1, e)
    else:
        return x_1


def grad_des_m_c(n, f, grad_f, start, end, x_0, l, e):
    x_1 = monte_carlo(n, f, grad_f, start, end, l)
    if norma(x_1, x_0, n) > e:
        return grad_des_m_c(n, f, grad_f, start, end, x_1, l, e)
    else:
        return x_1


def dichotomy(n, f, grad_f, start, end, x_0, e):
    while norma(end, start, n) > e:
        c = (start + end) / 2
        f1 = f(x_0 - (c + e).dot(grad_f(x_0)))
        f2 = f(x_0 - (c - e).dot(grad_f(x_0)))
        if f1 < f2:
            end = c
        else:
            start = c
    return (start + end) / 2


def monte_carlo(n, f, grad_f, start, end, l):
    min_x = np.zeros(n)
    for i in range(n):
        min_x[i] = random.uniform(start, end)
    min_f = f(min_x)
    for i in range(n):
        curr_x = min_x[i] - l * grad_f(min_x[i])
        if f(curr_x) < min_f:
            min_x = curr_x
    return min_x


#def f_1(x):
#    return x ** 3 - 4 * x ** 2 + 2 * x


#def grad_f_1(x):
#    return 3 * x ** 2 - 8 * x + 2


# def f_ros(x):
#     return sum(100.0 * (x[1:] - x[:-1] ** 2.0) ** 2.0 + (1 - x[:-1]) ** 2.0)
#
#
# def grad_f_ros(x):
#     xm = x[1:-1]
#     xm_m1 = x[:-2]
#     xm_p1 = x[2:]
#     der = np.zeros_like(x)
#     der[1:-1] = 200 * (xm - xm_m1 ** 2) - 400 * (xm_p1 - xm ** 2) * xm - 2 * (1 - xm)
#     der[0] = -400 * x[0] * (x[1] - x[0] ** 2) - 2 * (1 - x[0])
#     der[-1] = 200 * (x[-1] - x[-2] ** 2)
#     return der


#print(grad_des_1(2, f_ros, grad_f_ros, np.array([-3, -4]), 0.1, 0.01))
