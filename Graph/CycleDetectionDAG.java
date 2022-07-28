package Graph;

import java.util.ArrayList;

public class CycleDetectionDAG {
        private static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adjList) {
            boolean[] vis = new boolean[V+1];
            for(int i = 1 ; i <= V; i++) {
                if(vis[i] == false) {
                   return dfsTraversal(i, vis, adjList, );
                }
            }
            return false;
        }
        private static boolean dfsTraversal(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adjList, int prev) {
            vis[node] = true;
            for(Integer listNode: adjList.get(node)) {
                if(!vis[listNode]) {
                   return dfsTraversal(listNode, vis, adjList, node);
                }
                else if(node != prev) {
                    return true;
                }
            }
            return false;
        }
    }
    
