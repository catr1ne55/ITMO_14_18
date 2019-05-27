import unittest

import example_queue


class TestMaxElement(unittest.TestCase):
    def test_empty_queue(self):
        ex_queue = example_queue.MaxElementQueue()
        result = ex_queue.max_elem()
        expected = "empty"
        self.assertEqual(expected, result)

    def test_max_no_pop(self):
        ex_queue = example_queue.MaxElementQueue()
        ex_queue.push(1)
        ex_queue.push(3)
        ex_queue.push(100)
        ex_queue.push(42)
        ex_queue.push(3)
        ex_queue.push(64)
        result = ex_queue.max_elem()
        expected = 100
        self.assertEqual(expected, result)

    def test_one_pop(self):
        ex_queue = example_queue.MaxElementQueue()
        ex_queue.push(1)
        ex_queue.push(3)
        ex_queue.push(100)
        ex_queue.pop()
        ex_queue.push(42)
        ex_queue.push(3)
        ex_queue.push(64)
        result = ex_queue.max_elem()
        expected = 64
        self.assertEqual(expected, result)

    def test_all_pop(self):
        ex_queue = example_queue.MaxElementQueue()
        ex_queue.push(1)
        ex_queue.push(3)
        ex_queue.pop()
        ex_queue.pop()
        ex_queue.push(100)
        ex_queue.push(42)
        ex_queue.push(3)
        ex_queue.push(64)
        ex_queue.pop()
        ex_queue.pop()
        ex_queue.pop()
        ex_queue.pop()
        result = ex_queue.max_elem()
        expected = "empty"
        self.assertEqual(expected, result)

