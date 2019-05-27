import numpy as np
from keras.layers import Convolution2D, MaxPooling2D,Dropout
from keras.layers.core import Dense, Activation, Flatten
from keras.models import Sequential
from keras.optimizers import SGD
from keras.datasets import mnist


(X_train, y_train), (X_test, y_test) = mnist.load_data()
X_train = X_train.astype('float32')
X_test = X_test.astype('float32')
X_train /= 255
X_test /= 255
X_test = np.expand_dims(X_test, axis=1)
X_train = np.expand_dims(X_train, axis=1)
print(X_test.shape)
y_train_2 = np.zeros((60000, 10))
y_test_2 = np.zeros((10000, 10))
for i in range(60000):
    j = y_train[i]
    y_train_2[i, j] = 1
for i in range(10000):
    j = y_test[i]
    y_test_2[i, j] = 1

model = Sequential()
model.add(Convolution2D(32, 5, 5, border_mode='same', input_shape=(1, 28, 28)))
model.add(Activation("relu"))
model.add(MaxPooling2D(pool_size=(4, 4)))
model.add(Dropout(0.25))
model.add(Flatten())
model.add(Dense(output_dim=10, init="glorot_uniform"))
model.add(Activation("softmax"))
model.compile(loss='categorical_crossentropy', optimizer=SGD(lr=0.01, momentum=0.9, nesterov=True),metrics=["accuracy"])
model.fit(X_train, y_train_2, nb_epoch=20, batch_size=16, validation_data=(X_test, y_test_2), verbose=1, show_accuracy=1)
