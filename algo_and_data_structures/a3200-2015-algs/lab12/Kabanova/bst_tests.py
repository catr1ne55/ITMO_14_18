import unittest

from bst_tree import UnbalancedBinarySearchTree


class TestSorting(unittest.TestCase):
    def test_empty(self):
        bst_tree_set = UnbalancedBinarySearchTree()
        result = []
        for v in bst_tree_set:
            result.append(v)
        expected = []
        self.assertEqual(expected, result)

    def test_1(self):
        bst_tree_set = UnbalancedBinarySearchTree()
        bst_tree_set.add(1)
        result = []
        for v in bst_tree_set:
            result.append(v)
        expected = [1]
        self.assertEqual(expected, result)

    def test_2(self):
        bst_tree_set = UnbalancedBinarySearchTree()
        bst_tree_set.add(1)
        bst_tree_set.add(2)
        bst_tree_set.add(9)
        bst_tree_set.add(4)
        bst_tree_set.add(3)
        result = []
        for v in bst_tree_set:
            result.append(v)
        expected = [1, 2, 3, 4, 9]
        self.assertEqual(expected, result)

    def test_3(self):
        bst_tree_set = UnbalancedBinarySearchTree()
        bst_tree_set.add(4)
        bst_tree_set.add(2)
        bst_tree_set.add(0)
        bst_tree_set.add(1)
        bst_tree_set.add(3)
        result = []
        for v in bst_tree_set:
            result.append(v)
        expected = [0, 1, 2, 3, 4]
        self.assertEqual(expected, result)
