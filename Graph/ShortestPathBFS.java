package Graph;

import java.util.*;

public class ShortestPathBFS {
    private void shortestPath(ArrayList<ArrayList<Integer>> adj, int N, int initialElement) {
        int[] dist = new int[N];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();

        dist[initialElement] = 0;
        q.add(initialElement);

        while(!q.isEmpty()) {
            int node = q.poll();
            for(int curr: adj) {
                if(dist[node] + 1 < dist[curr]) {
                    dist[curr] = dist[node] + 1;
                    q.add(curr);
                }
            }
        }

        for(int i = 0 ; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        //Add zero to zero since th
    }
}
