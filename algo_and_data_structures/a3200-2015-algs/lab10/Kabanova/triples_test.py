import unittest

from pythagorean_triples import find_triples


class TestTriples(unittest.TestCase):

    def test_empty_array(self):
        array = []
        result = find_triples(array)
        expected = 0
        self.assertEqual(expected, result)

    def test_example(self):
        array = [23, 247, 19, 96, 264, 265, 132, 181]
        result = find_triples(array)
        expected = 2
        self.assertEqual(expected, result)

    def test_another(self):
        array = [3, 4, 6, 10, 56]
        result = find_triples(array)
        expected = 0
        self.assertEqual(expected, result)

    def test_another_1(self):
        array = [4, 3, 5]
        result = find_triples(array)
        expected = 1
        self.assertEqual(expected, result)

    def test_another_2(self):
        array = [4, 3, 5, 144, 17, 145]
        result = find_triples(array)
        expected = 2
        self.assertEqual(expected, result)

    def test_another_3(self):
        array = [4, 3, 5, 144, 17]
        result = find_triples(array)
        expected = 1
        self.assertEqual(expected, result)

