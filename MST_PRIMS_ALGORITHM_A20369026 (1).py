# Implement Prim's algorithm for finding MST
# coding: utf-8

# In[30]:

from heapq import heappop , heappush

def prims_mst(G, s):
    V, M = [] ,{} #V: vertices in MST, M: MST 
    # Priority Queue (weight , edge1 , edge2) 
    priorityQueue= [(0, None, s)]
    while priorityQueue:
        weight,p, u = heappop(priorityQueue) #choose edge with smallest weight
        #print(weight,p,u)
        if u in V: continue #skip any vertices already in MST 
        V.append(u)
        #build MST structure
        if p is None: 
            pass
        elif p in M: 
            M[p].append(u)
        else: 
            M[p]=[u]
        for v, w in G[u].items(): #add new edges to fringe 
            heappush(priorityQueue, (w, u, v))
    return M


G = {
      'a':{'b':7,'d':5},
      'b':{ 'a':7, 'd':9, 'c':8, 'e':7}, 'c':{'b':8,'e':5}, 'd':{'a':5,'b':9,'e':15,'f':6},
      'e':{ 'b' :7 , 'c' :5 , 'd' :15 , 'f' :8 , 'g' :9} , 'f':{'d':6,'e':8,'g':11},
      'g':{ 'e':9, 'f':11}
    }
print(prims_mst(G,'a'))


# In[ ]:




# In[ ]:




# In[ ]:



