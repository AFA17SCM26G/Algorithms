
# coding: utf-8

# In[35]:

#**********************************************************************************************
#  Function Name: dijkstra
#
#  Description: This function is used to get the shortest paths for each node in graph using dijkstra Algorithm
#
#  Parameters: Graph : The graph for which we need to find the Shortest path
#              Start:  Starting node.
#
#  Return: It will return the nodes with  shortest path.
#
#  Author: Anvesh Gangasani (agangasani@hawk.iit.edu)
#
#  History:
# 
#    Date                       Name                    Content
#    -----                   --------------            ------------------
#   10-07-2016               Anvesh Gangasani          Intial version
#
#***************************************************************************************************


def dijkstra(G, Start):
    vertex={} 
    dist={}
    prev={}
    for v in G:
        dist[v]=999999999  #Unknown distance from source to v I.e Infinity value
        prev[v]=None  #Previous node in optimal path from source
    dist[Start] =0
    for v in G:
        vertex[v]=dist[v]
    while vertex:
        for key in vertex:
            if vertex[key] < dist[key]:
                dist[key] = vertex[key]
                prev[key] = key
        del vertex[key]
        u=key
        for v in G[u].keys(): # for each neighbor of u
            
            w = G[u][v] # distance from u to v
           
            latest_dist = dist[u] + w
            if (latest_dist < dist[v]): # is new distance shorter than one in dist? Then we need to save latest dist
                vertex[v] = latest_dist
                dist[v] = latest_dist
                prev[v] = u
 
    return dist

    
   
    
    
G = {
      'a':{'b':7,'d':5},
      'b':{ 'a':7, 'd':9, 'c':8, 'e':7}, 'c':{'b':8,'e':5}, 'd':{'a':5,'b':9,'e':15,'f':6},
      'e':{ 'b' :7 , 'c' :5 , 'd' :15 , 'f' :8 , 'g' :9} , 'f':{'d':6,'e':8,'g':11},
      'g':{ 'e':9, 'f':11}
    }
dist_A = dijkstra(G, 'a')
print ("Shortest distance from each vertex:")
for v in dist_A: print ("%s: %s" % (v, dist_A[v]))

dist_B = dijkstra(G, 'b')
print ("Shortest distance from each vertex:")
for v in dist_B: print ("%s: %s" % (v, dist_B[v]))
    
dist_C = dijkstra(G, 'c')
print ("Shortest distance from each vertex:")
for v in dist_C: print ("%s: %s" % (v, dist_C[v]))

dist_D = dijkstra(G, 'd')
print ("Shortest distance from each vertex:")
for v in dist_D: print ("%s: %s" % (v, dist_D[v]))

dist_E = dijkstra(G, 'e')
print ("Shortest distance from each vertex:")
for v in dist_E: print ("%s: %s" % (v, dist_E[v]))

dist_F = dijkstra(G, 'f')
print ("Shortest distance from each vertex:")
for v in dist_F: print ("%s: %s" % (v, dist_F[v]))

dist_G = dijkstra(G, 'g')
print ("Shortest distance from each vertex:")
for v in dist_G: print ("%s: %s" % (v, dist_G[v]))

        
    


# In[ ]:




# In[ ]:



