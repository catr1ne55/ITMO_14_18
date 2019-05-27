from unittest import TestCase
from palindrom import max_palindrom

__author__ = 'catherinekabanova'


class Tests(TestCase):
    def test_1(self):
        string = "a"
        array_string = [str(k) for k in list(string)]
        result = "".join(max_palindrom(array_string))
        self.assertEqual(result, "a")

    def test_2(self):
        string = ""
        array_string = [str(k) for k in list(string)]
        result = "".join(max_palindrom(array_string))
        self.assertEqual(result, "")

    def test_3(self):
        string = "abca"
        array_string = [str(k) for k in list(string)]
        result = "".join(max_palindrom(array_string))
        self.assertEqual(result, "aca")

    def test_4(self):
        string = "babcad"
        array_string = [str(k) for k in list(string)]
        result = "".join(max_palindrom(array_string))
        self.assertEqual(result, "aca")

    def test_5(self):
        string = "аfроaзаупаланалаsdпуаilзора"
        array_string = [str(k) for k in list(string)]
        result = "".join(max_palindrom(array_string))
        self.assertEqual(result, "арозаупаланалапуазора")
