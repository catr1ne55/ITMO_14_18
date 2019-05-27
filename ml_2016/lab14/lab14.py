from keras.layers import LSTM, Embedding, Dense, Activation
from keras.models import Sequential
from keras.datasets import imdb
import numpy as np
from keras.optimizers import SGD

(X_train, y_train), (X_test, y_test) = imdb.load_data(path="imdb.pkl", nb_words=None, skip_top=0, maxlen=None, test_split=0.1)
max_len = 0
for i in range(len(X_train)):
    current_len = len(X_train[i])
    if current_len > max_len:
        max_len = current_len
for i in range(len(X_test)):
    current_len = len(X_test[i])
    if current_len > max_len:
        max_len = current_len
#print(max_len)
#print(X_train[0])
for i in range(len(X_train)):
    if len(X_train[i]) != 2821:
        zeroes = np.zeros(2821)
        for j in range(len(X_train[i])):
            zeroes[2821 - len(X_train[i]) + j] = X_train[i][j]
        X_train[i] = zeroes#.tolist()
for i in range(len(X_test)):
    if len(X_test[i]) != 2821:
        zeroes = np.zeros(2821)
        for j in range(len(X_test[i])):
            zeroes[2821 - len(X_test[i]) + j] = X_test[i][j]
        X_test[i] = zeroes#.tolist()
#print(X_train[0])
#print(np.shape(X_train[0]))
#print(np.shape(X_test[0]))
#print(np.shape(y_train))
# max_dim = 0
# for i in range(len(X_train)):
#     for j in range(len(X_train[i])):
#         if X_train[i][j] > max_dim:
#             max_dim = X_train[i][j]
# for i in range(len(X_test)):
#     for j in range(len(X_test[i])):
#         if X_test[i][j] > max_dim:
#             max_dim = X_test[i][j]
# print(max_dim)



model = Sequential()
model.add(Embedding(102102, 256, input_length=2821))
model.add(LSTM(32))
model.add(Dense(1, init="glorot_uniform"))
model.add(Activation("sigmoid"))
model.compile(loss='binary_crossentropy', optimizer=SGD(lr=0.01, momentum=0.9, nesterov=True), metrics=["accuracy"])
model.fit(X_train, y_train, nb_epoch=1, batch_size=32, validation_data=(X_test, y_test), verbose=1, show_accuracy=True)
