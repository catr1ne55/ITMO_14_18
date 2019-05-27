class Queue:
    def pop(self):
        pass

    def push(self, n):
        pass

    def size(self):
        pass


class StackQueue(Queue):
    def __init__(self):
        self.queue1 = ArrayQueue()
        self.queue2 = ArrayQueue()

    def pop(self):
        if self.queue1.is_empty() and self.queue2.is_empty():
            print("empty")
        else:
            if self.queue1.is_empty():
                while not self.queue2.is_empty():
                    self.queue1.push(self.queue2.last_elem())
                    self.queue2.pop()
                print(self.queue1.pop())
            else:
                print(self.queue1.pop())

    def push(self, n):
        self.queue2.push(n)
        print("ok")

    def size(self):
        return self.queue1.size() + self.queue2.size()

    def __str__(self):
        return str(self.queue1) + str(self.queue2)


class ArrayQueue:
    def __init__(self):
        self.queue = []

    def push(self, x):
        self.queue.append(x)
        return x

    def pop(self):
        pop_elem = self.last_elem()
        if len(self.queue) != 1:
            self.queue = [self.queue[i] for i in range(0, len(self.queue) - 1)]
        else:
            self.queue = []
        return pop_elem

    def size(self):
        return len(self.queue)

    def is_empty(self):
        if not self.queue:
            return True
        else:
            return False

    def last_elem(self):
        return self.queue[len(self.queue) - 1]

    def __str__(self):
        return str(self.queue)


class MaxElementQueue(Queue):
    def __init__(self):
        self.queue = StackQueue()
        self.max2 = float('-Inf')
        self.max_queue = ArrayQueue()

    def pop(self):
        if self.size() > 0:
            local_max = float('-Inf')
            if self.queue.queue1.is_empty():
                while not self.queue.queue2.is_empty():
                    item = self.queue.queue2.last_elem()
                    self.queue.queue2.pop()
                    self.queue.queue1.push(item)
                    if item > local_max:
                        local_max = item
                    self.max_queue.push(local_max)
                if self.queue.queue1.last_elem() == self.max_queue.last_elem():
                    self.max_queue.pop()
                print(self.queue.queue1.pop())
            else:
                if not self.max_queue.is_empty():
                    if self.queue.queue1.last_elem() == self.max_queue.last_elem():
                        self.max_queue.pop()
                print(self.queue.queue1.pop())
        else:
            print("empty")

    def push(self, n):
        if self.size() == 0:
            self.max2 = n
        else:
            if n >= self.max2:
                self.max2 = n
        self.queue.push(n)

    def size(self):
        return self.queue.size()

    def max_elem(self):
        if self.queue.size() == 0:
            print("empty")
        else:
            if self.max2 > self.max_queue.last_elem():
                print(self.max2)
            else:
                print(self.max_queue.last_elem())

