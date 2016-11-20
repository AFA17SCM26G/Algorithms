## BFS Implementation
def bfs(graph, start):
    visited, queue = set(), [start]
    while queue:
        vertex = queue.pop(0)
        if vertex not in visited:
            visited.add(vertex)
            queue.extend(graph[vertex] - visited)
    return visited
## BFS posible paths implementation
def bfs_paths(graph, start, end):
    queue = [(start, [start])]
    while queue:
        (vertex, path) = queue.pop(0)
        for next in graph[vertex] - set(path):
            if next == end:
                yield path + [next]
            else:
                queue.append((next, path + [next]))

## DFS Implementation

def dfs(graph, start):
    visited, stack = set(), [start]
    while stack:
        vertex = stack.pop()
        if vertex not in visited:
            visited.add(vertex)
            stack.extend(graph[vertex] - visited)
    return visited
    
## DFS posible paths implementation

def dfs_paths(graph, start, end):
    stack = [(start, [start])]
    while stack:
        (vertex, path) = stack.pop()
        for next in graph[vertex] - set(path):
            if next == end:
                yield path + [next]
            else:
                stack.append((next, path + [next]))
                

## Shortest path implementation using BFS
def shortest_path(graph, start, end):
    try:
        return next(bfs_paths(graph, start, end))
    except StopIteration:
        return None


                

graph = {'A': set(['B', 'C']),
         'B': set(['A', 'D', 'E']),
         'C': set(['A', 'F']),
         'D': set(['B']),
         'E': set(['B', 'F']),
         'F': set(['C', 'E'])}

print(bfs(graph, 'A'))
print(list(bfs_paths(graph, 'A', 'F')))       
print(dfs(graph, 'A'))
#print(dfs_rec(graph,'C'))
print(list(dfs_paths(graph, 'A', 'F')))
print(shortest_path(graph, 'A', 'F'))
