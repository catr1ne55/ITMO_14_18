__author__ = 'catherinekabanova'
import unittest
from dam_lev_distance import d_l_distance


class TestSorting(unittest.TestCase):
    def test_0_empty(self):
        first_word = ""
        second_word = ""
        result = d_l_distance(first_word, second_word)
        expected = 0
        self.assertEqual(expected, result)

    def test_1_empty(self):
        first_word = "cat"
        second_word = ""
        result = d_l_distance(first_word, second_word)
        expected = 3
        self.assertEqual(expected, result)

    def test_2(self):
        first_word = "ab"
        second_word = "aba"
        result = d_l_distance(first_word, second_word)
        expected = 1
        self.assertEqual(expected, result)

    def test_3(self):
        first_word = "ab"
        second_word = "aabs"
        result = d_l_distance(first_word, second_word)
        expected = 2
        self.assertEqual(expected, result)

    def test_4(self):
        first_word = "Levenshtien"
        second_word = "Frankenstein"
        result = d_l_distance(first_word, second_word)
        expected = 7
        self.assertEqual(expected, result)

