
# coding: utf-8

# In[54]:

#**********************************************************************************************
#  Function Name: kruskal
#
#  Description: This function is used to get the Minimum Spanning tree from the given Graph using Kruskal's Algorithm
#
#  Parameters: Graph : The graph for which we need to find the MST
#
#  Return: It will return the list consists of MST.
#
#  Author: Anvesh Gangasani (agangasani@hawk.iit.edu)
#
#  History:
# 
#    Date                       Name                    Content
#    -----                   --------------            ------------------
#   10-08-2016               Anvesh Gangasani          Intial version
#
#***************************************************************************************************
def kruskal(G):
    edges = [(G[u][v],u,v) for u in G for v in G[u]]
    
    T = []
    
   
    comp= {u:u for u in G}
    reps= {u:0 for u in G} # Comp. reps and ranks 
    
 
    for w, u, v in sorted(edges):
        
        if find(comp, u) != find(comp, v):
            T.append((u, v))
            
            combine(comp, reps, u, v)
    return T
#**********************************************************************************************
#  Function Name: find
#
#  Description: This function is used to find the  component representative by compressing the path.
#
#  Parameters: comp : List of component representative.
#                  u: Starting node   
#
#  Return: it returns representative value.
#
#  Author: Anvesh Gangasani (agangasani@hawk.iit.edu)
#
#  History:
# 
#    Date                       Name                    Content
#    -----                   --------------            ------------------
#   10-08-2016               Anvesh Gangasani          Intial version
#
#***************************************************************************************************

def find(comp, u): 
    if comp[u] != u: 
        comp[u] = find(comp, comp[u]) 
    return comp[u] 
#**********************************************************************************************
#  Function Name: combine
#
#  Description: This function is used to combine all component representative by rank.
#
#  Parameters: Graph : The graph for which we need to find the MST
#
#
#  Author: Anvesh Gangasani (agangasani@hawk.iit.edu)
#
#  History:
# 
#    Date                       Name                    Content
#    -----                   --------------            ------------------
#   10-08-2016               Anvesh Gangasani          Intial version
#
#***************************************************************************************************
def combine(comp, reps, u, v):
    u, v = find(comp, u), find(comp, v) 
    if reps[u] > reps[v]:  
        comp[v] = u 
    else: comp[u] = v 
    if reps[u] == reps[v]: 
            reps[v]+=1

Graph = {
      'a':{'b':7,'d':5},
      'b':{ 'a':7, 'd':9, 'c':8, 'e':7}, 'c':{'b':8,'e':5}, 'd':{'a':5,'b':9,'e':15,'f':6},
      'e':{ 'b' :7 , 'c' :5 , 'd' :15 , 'f' :8 , 'g' :9} , 'f':{'d':6,'e':8,'g':11},
      'g':{ 'e':9, 'f':11}
    }
MST=kruskal(Graph)
print("Minimum Spanning Tree:",MST)


# In[ ]:



