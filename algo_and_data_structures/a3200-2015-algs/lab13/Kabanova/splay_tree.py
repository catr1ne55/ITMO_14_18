__author__ = 'catherinekabanova'


class Node:
    def __init__(self, key):
        self.key = key
        self.right = None
        self.left = None


class SplayTree:
    """
    A splay tree is a self-adjusting binary search tree with the additional property
    that recently accessed elements are quick to access again.
    This class includes methods: insert, remove, contains, splay.
    """

    def __init__(self):
        """Initialize splay tree"""
        self.root = None
        self.header = Node(None)

    def insert(self, value):
        """Insert a new node with the key = value into the splay tree."""
        if self.root is None:
            self.root = Node(value)
        self.splay(value)
        if self.root.key != value:
            node_to_insert = Node(value)
            if value < self.root.key:
                node_to_insert.left = self.root.left
                node_to_insert.right = self.root
                self.root.left = None
            else:
                node_to_insert.right = self.root.right
                node_to_insert.left = self.root
                self.root.right = None
            self.root = node_to_insert

    def remove(self, value):
        """Remove node with the key = value from the splay tree."""
        self.splay(value)
        if value != self.root.key:
            raise Exception('There is no such key')
        if self.root.left is None:
            self.root = self.root.right
        else:
            x = self.root.right
            self.root = self.root.left
            self.splay(value)
            self.root.right = x

    def contains(self, value):
        """Check whether the splay tree contains a node with the key = value."""
        if self.root is None:
            return None
        self.splay(value)
        if self.root.key != value:
            return None
        return self.root.key

    def splay(self, value):
        """Splay node with key = value."""
        l_node = self.header
        r_node = self.header
        t_node = self.root
        self.header.left = self.header.right = None
        while True:
            if value < t_node.key:
                if t_node.left is None:
                    break
                if value < t_node.left.key:
                    y = t_node.left
                    t_node.left = y.right
                    y.right = t_node
                    t_node = y
                    if t_node.left is None:
                        break
                r_node.left = t_node
                r_node = t_node
                t_node = t_node.left
            elif value > t_node.key:
                if t_node.right is None:
                    break
                if value > t_node.right.key:
                    y = t_node.right
                    t_node.right = y.left
                    y.left = t_node
                    t_node = y
                    if t_node.right is None:
                        break
                l_node.right = t_node
                l_node = t_node
                t_node = t_node.right
            else:
                break
        l_node.right = t_node.left
        r_node.left = t_node.right
        t_node.left = self.header.right
        t_node.right = self.header.left
        self.root = t_node

    def __iter__(self):
        """Iterate the splay tree."""
        node = self.root
        if node is None:
            return
        while True:
            while node.left is not None:
                node = node.left
            self.splay(node.key)
            if self.root.right is not None:
                node = self.root.right
                yield self.root
            else:
                yield self.root
                break
