package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second;
    }
    
}
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
         // Code here
        boolean[] vis = new boolean[V+1];
        ArrayList<Integer> bfs = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                 Queue<Integer> ds = new LinkedList<>();
                 ds.add(i);
                 vis[i] = true;
                 while(!ds.isEmpty()) {
                     Integer node = ds.poll();
                     bfs.add(node);
                     for(Integer adjEle: adj.get(node)) {
                         if(!vis[adjEle]) {
                             vis[adjEle] = true;
                             ds.add(adjEle);
                         }
                     }
                 }
            }
        }
        return bfs;
    }
    private static boolean checkForCycle(int s, boolean vis[], ArrayList<ArrayList<Integer>> adj) {
        Queue<Node> bfsQ = new LinkedList<>();

        bfsQ.add(new Node(s, -1));
        while(!bfsQ.isEmpty()) {
            int node = bfsQ.peek().first;
            int parent = bfsQ.peek().second;
            for(Integer ele: adj.get(node)) {
                if(!vis[ele]) {
                    vis[ele] = true;
                    bfsQ.add(new Node(ele, node));
                }
                else if(ele != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V+1];
        for(int i = 1; i <= V; i++) {
            if(!visited[i]) {
                return checkForCycle(i, visited, adj);
            }
        }
        return false;
    }
}
