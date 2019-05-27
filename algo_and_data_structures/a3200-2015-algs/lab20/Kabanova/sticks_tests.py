from unittest import TestCase
from sticks import max_square

class Tests(TestCase):
    def test_0(self):
        number_of_sticks = 0
        sticks = []
        result = max_square(number_of_sticks, sticks)
        expected = 0
        self.assertEqual(result, expected)

    def test_1(self):
        number_of_sticks = 3
        sticks = [1, 3, 2]
        result = max_square(number_of_sticks, sticks)
        expected = 0
        self.assertEqual(result, expected)

    def test_2(self):
        number_of_sticks = 4
        sticks = [1, 2, 6, 7]
        result = max_square(number_of_sticks, sticks)
        expected = 6
        self.assertEqual(result, expected)

    def test_3(self):
        number_of_sticks = 7
        sticks = [1, 2, 3, 3, 6, 7, 8]
        result = max_square(number_of_sticks, sticks)
        expected = 21
        self.assertEqual(result, expected)

    def test_4(self):
        number_of_sticks = 10
        sticks = [1, 0, 1, 8, 4, 12, 1, 16, 15, 10]
        result = max_square(number_of_sticks, sticks)
        expected = 15
        self.assertEqual(result, expected)