import numpy as np
from keras.layers.core import Dense, Activation
from keras.models import Sequential
from keras.optimizers import SGD
from sklearn import datasets

model = Sequential()
model.add(Dense(output_dim=64, input_dim=64, init="uniform"))
model.add(Activation("relu"))
model.add(Dense(output_dim=10, init="uniform"))
model.add(Activation("softmax"))
model.compile(loss='categorical_crossentropy', optimizer=SGD(lr=0.01, momentum=0.9, nesterov=True), metrics=["accuracy"])
digits = datasets.load_digits()
x = digits.data
y = digits.target
y2 = np.zeros((1797, 10))
for i in range(1797):
    j = y[i]
    y2[i, j] = 1

model.fit(x, y2, nb_epoch=15, batch_size=64, validation_split=0.3, verbose=2, show_accuracy=True)
