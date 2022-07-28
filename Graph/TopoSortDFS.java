package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSortDFS {
    static int[] topoSort(int N, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> result = new Stack<>();
        boolean[] vis = new boolean[N];
        for(int i = 0 ; i < N; i++) {
            if(!vis[i]) {
                calculateTopoSort(i, vis, adj, result);
            }
        }
        int topo[] = new int[N];
        int ind = 0;
        while(!result.isEmpty()) {
            topo[ind] = result.pop(); 
        }
        return topo;
    }

    static void calculateTopoSort(int vertex, boolean[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
        vis[vertex] = true;
        for(Integer it: adj.get(vertex)) {
            if(!vis[it]) {
                calculateTopoSort(vertex, vis, adj, st);
            }
        }
        st.push(vertex);
    }
}
