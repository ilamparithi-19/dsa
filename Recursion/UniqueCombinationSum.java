package Recursion;

 import java.util.*;
 public class UniqueCombinationSum {
     public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(candidates);
         findCombinations(0, candidates, target, ans, new ArrayList<>());
         return ans;
     }
     public static void main(String args[]) {
         int v[] = { 10, 1, 2, 7, 6, 1, 5 };
         List<List<Integer>> comb = combinationSum2(v, 8);
         System.out.println(comb.toString().replace(",", " "));
     }
     private static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> result, List<Integer> ds) {
         if (target == 0) {
             result.add(new ArrayList<>(ds));
             return;
         }
         for (int i = ind; i < arr.length; i++) {
             if (ind != i && arr[i] == arr[i - 1])
                 continue;
             if (arr[i] > target) {
                 break;
             }
             ds.add(arr[i]);
             findCombinations(i + 1, arr, target - arr[i], result, ds);
             ds.remove(ds.size() - 1);
         }
     }
 }
