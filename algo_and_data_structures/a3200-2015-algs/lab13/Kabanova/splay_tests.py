__author__ = 'catherinekabanova'
import unittest
import splay_tree


class TestSplayTree(unittest.TestCase):

    def test_0_empty(self):
        tree = splay_tree.SplayTree()
        self.assertFalse(tree.contains(6))

    def test_1_iter(self):
        tree = splay_tree.SplayTree()
        tree.insert(0)
        tree.insert(6)
        tree.insert(2)
        tree.insert(9)
        array = []
        for v in tree:
            array.append(v.key)
        expected = [0, 2, 6, 9]
        self.assertEquals(expected, array)

    def test_2_contain(self):
        tree = splay_tree.SplayTree()
        array = [5, 75, 63, 89, 10, 11]
        for elem in array:
            tree.insert(elem)
        self.assertFalse(tree.contains(100))
        self.assertTrue(tree.contains(11))

    def test_3_remove(self):
        tree = splay_tree.SplayTree()
        array = [5, 75, 63, 89, 10, 11]
        for elem in array:
            tree.insert(elem)
        tree.remove(89)
        tree.remove(5)
        array_out = []
        for v in tree:
            array_out.append(v.key)
        self.assertEqual(array_out, [10, 11, 63, 75])