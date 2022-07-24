package Graph;

import java.util.ArrayList;

public class dfs {
    private static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> dfsResult = new ArrayList<>();
        boolean[] vis = new boolean[V+1];
        for(int i = 1 ; i <= V; i++) {
            if(vis[i] == false) {
                dfsTraversal(i, vis, adjList, dfsResult);
            }
        }
        return dfsResult;
    }
    private static void dfsTraversal(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adjList, ArrayList<Integer> result) {
        result.add(node);
        vis[node] = true;
        for(Integer listNode: adjList.get(node)) {
            if(!vis[listNode]) {
                dfsTraversal(listNode, vis, adjList, result);
            }
        }
    }
}
