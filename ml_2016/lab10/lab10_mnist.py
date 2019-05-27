import numpy as np
from keras.layers.core import Dense, Activation
from keras.models import Sequential
from keras.optimizers import SGD
from keras.datasets import mnist


(X_train, y_train), (X_test, y_test) = mnist.load_data()
X_train = np.reshape(X_train, (X_train.shape[0], 784))
X_test = np.reshape(X_test, (X_test.shape[0], 784))
X_train = X_train.astype('float32')
X_test = X_test.astype('float32')
X_train /= 255
X_test /= 255
y_train_2 = np.zeros((60000, 10))
y_test_2 = np.zeros((10000, 10))
for i in range(60000):
    j = y_train[i]
    y_train_2[i, j] = 1
for i in range(10000):
    j = y_test[i]
    y_test_2[i, j] = 1

model = Sequential()
model.add(Dense(output_dim=500, input_dim=784, init="glorot_uniform"))
model.add(Activation("relu"))
model.add(Dense(output_dim=784, init="glorot_uniform"))
model.add(Activation("relu"))
model.compile(loss='mse', optimizer=SGD(lr=0.001, momentum=0.9, nesterov=True), metrics=["accuracy"])
model.fit(X_train, X_train, nb_epoch=15, batch_size=16, validation_data=(X_test, X_test), verbose=2, show_accuracy=True)


model_2 = Sequential()
model_2.add(Dense(output_dim=500, input_dim=784, init="glorot_uniform", weights=model.layers[0].get_weights()))
model_2.add(Activation("relu"))
model_2.add(Dense(output_dim=10, init="glorot_uniform"))
model_2.add(Activation("softmax"))
model_2.compile(loss='categorical_crossentropy', optimizer=SGD(lr=0.001, momentum=0.9, nesterov=True), metrics=["accuracy"])
model_2.fit(X_train, y_train_2, nb_epoch=15, batch_size=16, validation_data=(X_test, y_test_2), verbose=2, show_accuracy=True)
