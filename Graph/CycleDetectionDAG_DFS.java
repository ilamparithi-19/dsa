package Graph;

import java.util.ArrayList;

public class CycleDetectionDAG_DFS {
        private static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adjList) {
            boolean[] vis = new boolean[V+1];
            boolean[] dfsVisited = new boolean[V+1];
            for(int i = 1 ; i <= V; i++) {
                if(vis[i] == false) {
                   return dfsTraversal(i, vis, adjList, dfsVisited);
                }
            }
            return false;
        }
        private static boolean dfsTraversal(int node, boolean[] vis, 
        ArrayList<ArrayList<Integer>> adjList, boolean[] dfsVisited) {
            vis[node] = true;
            dfsVisited[node] = true;
            for(Integer listNode: adjList.get(node)) {
                if(!vis[listNode]) {
                   return dfsTraversal(listNode, vis, adjList, dfsVisited);
                }
                else if(dfsVisited[listNode]]) {
                    return true;
                }
            }
            dfsVisited[node] = false;
            return false;
        }
    }
    
