from sklearn import datasets
from sklearn.neighbors import KNeighborsClassifier
from random import shuffle


iris = datasets.load_iris()
x = iris.data
y = iris.target
new_iris = []
for i in range(len(x)):
    new_iris.append([x[i], y[i]])
shuffle(new_iris)
new_x = []
new_y = []
for i in range(len(new_iris)):
    new_x.append(new_iris[i][0])
    new_y.append(new_iris[i][1])
x_train = [new_x[i] for i in range(50)]
y_train = [new_y[i] for i in range(50)]
x_test = [new_x[i] for i in range(50, 150)]
y_test = [new_y[i] for i in range(50, 150)]
kNN = KNeighborsClassifier(n_neighbors=10)
kNN.fit(x_train, y_train)
kNN.predict(x_test)
print(kNN.score(x_test, y_test))
