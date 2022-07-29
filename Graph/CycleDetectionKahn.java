package Graph;

import java.util.*;

//Cycle detection using Kahns algo
public class CycleDetectionKahn {
    
    static boolean topoSort(int N, ArrayList<ArrayList<Integer>> adj) {
        int topo[] = new int[N];
        int indegree[] = new int[N];
        for(int i = 0; i < N ; i++) {
            for(Integer it: adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < N ; i++) {
            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        int ind = 0;
        while(!q.isEmpty()) {
            int node = q.poll();
            topo[ind] = node;
            ind++;
            for(Integer ele: adj.get(node)) {
                indegree[ele]--;
                if(indegree[ele] == 0) {
                    q.add(ele);
                } 
            }
        }
        // if topo sort is not formed it means there is a cycle. Ie. Topo sort is applicable for DAG
        //We can count the values in topo array
        if(topo.length == N) {
            return false; //No Cycle
        }
        return true;
    }
}
