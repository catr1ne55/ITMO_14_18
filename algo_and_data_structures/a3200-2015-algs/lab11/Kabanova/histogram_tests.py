import unittest

from histogram import max_square


class TestMaxSquare(unittest.TestCase):
    def test_empty_array(self):
        array = []
        result = max_square(array)
        expected = 0
        self.assertEqual(expected, result)

    def test_one_elem(self):
        array = [2]
        result = max_square(array)
        expected = 0
        self.assertEqual(expected, result)

    def test_three_elem(self):
        array = [2, 5, 1]
        result = max_square(array)
        expected = 4
        self.assertEqual(expected, result)

    def test_example(self):
        array = [2, 5, 1, 2, 3, 4, 7, 7, 6]
        result = max_square(array)
        expected = 10
        self.assertEqual(expected, result)

