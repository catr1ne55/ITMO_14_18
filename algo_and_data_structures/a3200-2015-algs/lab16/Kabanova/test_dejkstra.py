import unittest
import paths_d


class TestD(unittest.TestCase):

    def test_0(self):
        graph = paths_d.WeightedGraph()
        graph.add_vertex(0)
        graph.add_vertex(1)
        result = graph.paths(0)
        expected = [0, None]
        self.assertEquals(expected, result)

    def test_1(self):
        graph = paths_d.WeightedGraph()
        graph.add_vertex(0)
        graph.add_vertex(1)
        graph.add_vertex(2)
        graph.add_direct_link(0, 1, 1)
        graph.add_direct_link(1, 2, 0)
        graph.add_direct_link(0, 2, 1)
        result = graph.paths(0)
        expected = [0, 1, 1]
        self.assertEquals(expected, result)

    def test_2(self):
        graph = paths_d.WeightedGraph()
        graph.add_vertex(0)
        graph.add_vertex(1)
        graph.add_vertex(2)
        graph.add_direct_link(0, 1, 2)
        graph.add_direct_link(2, 1, 0)
        graph.add_direct_link(0, 2, 1)
        result = graph.paths(0)
        expected = [0, 1, 1]
        self.assertEquals(expected, result)
