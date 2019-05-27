__author__ = 'catherinekabanova'


class Set:
    def add(self, value):
        pass

    def iterate(self):
        pass


class Node:
    def __init__(self, val):
        self.val = val
        self.left = None
        self.right = None
        self.parent = None


class UnbalancedBinarySearchTree(Set):
    def __init__(self):
        self.root = None

    def add(self, value):
        if self.root is None:
            self.root = Node(value)
            return
        z = Node(value)
        y = None
        x = self.root
        while x is not None:
            y = x
            if value < x.val:
                x = x.left
            elif value > x.val:
                x = x.right
            else:
                return
        z.parent = y
        if value < y.val:
            y.left = z
        else:
            y.right = z

    def search(self, x, value):
        if x is None:
            return False
        elif x.value == value:
            return True
        if value < x.value:
            return self.search(x.left, value)
        else:
            return self.search(x.right, value)

    def iterate(self):
        tree_iterator = TreeIterator(self.root)
        while tree_iterator.has_next():
            yield tree_iterator.next()

    def __iter__(self):
        return self.iterate()


class TreeIterator:
    def __init__(self, root):
        root = self.find_smallest(root)
        self.min = Node(None)
        self.min.parent = root

    def has_next(self):
        slider = self.min
        if slider.right is not None:
            return True
        while slider.parent is not None and slider is slider.parent.right:
            slider = slider.parent
        if slider.parent is None:
            return False
        return True

    def next(self):
        self.min = self.find_next(self.min)
        return self.min.val

    def find_smallest(self, root):
        if root is None:
            return None
        while root.left is not None:
            root = root.left
        return root

    def find_next(self, node):
        if node.right is not None:
            node = node.right
            while node.left is not None:
                node = node.left
            return node
        else:
            while node.parent is not None and node is node.parent.right:
                node = node.parent
            return node.parent
