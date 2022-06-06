package Recursion;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        CombinationSum sol = new CombinationSum();
        List < List < Integer >> ls = sol.combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    private List<List<Integer>> combinationSum(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        combinationSumSol(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
    private void combinationSumSol(int i, int[] candidates, int target, List<List<Integer>> ans, 
    ArrayList<Integer> ds) {
            if(i == candidates.length) {
                if(target == 0) {
                    ans.add(new ArrayList<>(ds));
                }
                return;
            }
            if(candidates[i] <= target) {
                ds.add(candidates[i]);
                combinationSumSol(i, candidates, target - candidates[i], ans, ds);
                ds.remove(ds.size() - 1);
            }   
            combinationSumSol(i+1, candidates, target, ans, ds);
           
    }
}
