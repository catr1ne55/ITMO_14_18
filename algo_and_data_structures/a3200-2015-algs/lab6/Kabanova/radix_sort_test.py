import unittest
from radix_sort import radix_sort


class TestSorting(unittest.TestCase):
    def test_trivial(self):
        arr = [1, 3, 2]
        res = radix_sort(arr)
        expected = [1, 2, 3]
        self.assertEqual(expected, res)

    def test_empty(self):
        arr = [21, 10, 36, 99, 57]
        res = radix_sort(arr)
        expected = [10, 21, 36, 57, 99]
        self.assertEqual(expected, res)

    def test_one_negative(self):
        arr = [-21, 10, 36, 99, 57]
        res = radix_sort(arr)
        expected = [-21, 10, 36, 57, 99]
        self.assertEqual(expected, res)

    def test_two_negative(self):
        arr = [-21, 10, 36, -99, 57]
        res = radix_sort(arr)
        expected = [-99, -21, 10, 36, 57]
        self.assertEqual(expected, res)

    def test_all_negative(self):
        arr = [-21, -10, -36, -99, -57]
        res = radix_sort(arr)
        expected = [-99, -57, -36, -21, -10]
        self.assertEqual(expected, res)
