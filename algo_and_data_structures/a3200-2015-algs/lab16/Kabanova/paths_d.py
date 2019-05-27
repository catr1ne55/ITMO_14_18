import heapq


class Vertex:
    def __init__(self, v_key):
        self.v_key = v_key
        self.weight = {}
        self.path = float("inf")
        self.parent = None

    def __lt__(self, other):
        return self.path < other.path


class WeightedGraph:
    def __init__(self):
        self.graph = []

    def __str__(self):
        return str(self.graph)

    def add_vertex(self, vertex):
        self.graph.append(Vertex(vertex))

    def add_direct_link(self, vertex_1, vertex_2, weight):
        self.graph[vertex_1].weight[vertex_2] = weight

    def relax(self, start_v, end_v, weight):
        if self.graph[end_v].path > self.graph[start_v].path + weight:
            self.graph[end_v].path = self.graph[start_v].path + weight
            self.graph[end_v].parent = start_v

    def paths(self, vertex_to):
        queue = []
        for vertex in self.graph:
            if vertex.v_key == vertex_to:
                vertex.path = 0
                vertex.parent = vertex_to
            else:
                vertex.path = float("inf")
                vertex.parent = None
            heapq.heappush(queue, vertex)
        while len(queue) != 0:
            vertex_u = heapq.heappop(queue)
            for w in vertex_u.weight:
                self.relax(vertex_u.v_key, w, vertex_u.weight[w])
        for i in self.graph:
            if i.path == float("inf"):
                i.path = None
        return [i.path for i in self.graph]