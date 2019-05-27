# colors: 0 - white, 1 - grey, 2 - black
class Vertex:
    def __init__(self, key):
        self.key = key
        self.edges = []
        self.color = 0


class Graph:
    def __init__(self):
        self.graph = []
        self.sorted_vertexes = []

    def add_vertex(self, v_key):
        i = len(self.graph)
        while i <= v_key:
            self.graph.append(Vertex(i))
            i += 1

    def add_directed_link(self, v1, v2):
        self.graph[v1].edges.append(self.graph[v2])

    def dfs(self, v_key):
        v = self.graph[v_key]
        if v.color != 2:
            v.color = 1
            for vertex in v.edges:
                if vertex.color == 0:
                    self.dfs(vertex.key)
                if vertex.color == 1:
                    return "None"
            v.color = 2
            self.sorted_vertexes.append(v.key)

    def topological_sort(self, v_key):
        if len(self.graph) == 0:
            return 0
        for vertex in self.graph:
            if vertex.color == 0:
                p = self.dfs(vertex.key)
                if p == "None":
                    return "None"
        return self.sorted_vertexes

