package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Check if near by nodes have alternate colors(Only 2 colors allowed)
class BiPartiteGraph {
    // Function to return Breadth First Traversal of given graph.
    
    private static boolean bfsCheck(int s, int color[], ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> bfsQ = new LinkedList<>();

        bfsQ.add(s);
        color[s] = 1;
        while(!bfsQ.isEmpty()) {
            int node = bfsQ.poll();
            for(Integer ele: adj.get(node)) {
                if(color[ele] == -1) {
                    color[ele] = (color[s] == 1 ? 0 : 1);
                    bfsQ.add(ele);
                }
                else if(color[ele] == color[s]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkBiPartite(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] color = new int[V];
        Arrays.fill(color, -1);
        for(int i = 1; i <= V; i++) {
            if(color[i] == -1) {
                if(!bfsCheck(i, color, adj)) {
                    return false;
                }
                 
            }
        }
        return true;
    }
}
