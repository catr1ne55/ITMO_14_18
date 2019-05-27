__author__ = 'catherinekabanova'
import unittest
import top_sort


class TestGraph(unittest.TestCase):
    def test_empty(self):
        graph = top_sort.Graph()
        self.assertEqual(graph.topological_sort(0), 0)

    def test_cycle(self):
        graph = top_sort.Graph()
        graph.add_vertex(0)
        graph.add_vertex(1)
        graph.add_vertex(2)
        graph.add_vertex(3)
        graph.add_directed_link(0, 1)
        graph.add_directed_link(0, 2)
        graph.add_directed_link(0, 3)
        graph.add_directed_link(2, 3)
        graph.add_directed_link(3, 0)
        self.assertEqual(graph.topological_sort(0), "None")

    def test_1(self):
        graph = top_sort.Graph()
        graph.add_vertex(0)
        graph.add_vertex(1)
        graph.add_vertex(2)
        graph.add_vertex(3)
        graph.add_vertex(4)
        graph.add_vertex(5)
        graph.add_vertex(6)
        graph.add_vertex(7)
        graph.add_directed_link(0, 1)
        graph.add_directed_link(0, 2)
        graph.add_directed_link(0, 3)
        graph.add_directed_link(2, 3)
        graph.add_directed_link(4, 5)
        graph.add_directed_link(4, 6)
        graph.add_directed_link(4, 7)
        self.assertEqual(graph.topological_sort(0), [1, 3, 2, 0, 5, 6, 7, 4])

    def test_2(self):
        graph = top_sort.Graph()
        graph.add_vertex(0)
        graph.add_vertex(1)
        graph.add_vertex(2)
        graph.add_vertex(3)
        graph.add_vertex(4)
        graph.add_vertex(5)
        graph.add_vertex(6)
        graph.add_vertex(7)
        graph.add_directed_link(2, 5)
        graph.add_directed_link(2, 6)
        graph.add_directed_link(4, 7)
        graph.add_directed_link(5, 7)
        graph.add_directed_link(6, 7)
        self.assertEqual(graph.topological_sort(0), [0, 1, 7, 5, 6, 2, 3, 4])
