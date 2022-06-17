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
}