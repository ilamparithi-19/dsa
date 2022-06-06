/*
 * To be revisited
 */

package Recursion;
import java.util.*;
public class UniqueSubSet {
    public static void main(String args[]) {
        int nums[]={1,2,2};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        subsetsWithDup(0, nums, nums.length, result, new ArrayList<Integer>());
        printAns(result);

    }
    private static void subsetsWithDup(int ind, int[] nums, int N, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> ds) {
        result.add(new ArrayList<>(ds));
        for(int i = ind; i < N; i++) {
            if( i != ind && nums[i] == nums[i - 1]) continue;
            ds.add(nums[i]);
            subsetsWithDup(ind + 1 , nums, N, result, ds);
            ds.remove(ds.size() - 1);
        }
    }

    static void printAns(ArrayList<ArrayList<Integer> > ans) {
        System.out.println("The unique subsets are ");
        for(List<Integer> list: ans) {
            System.out.println(list.toString());
        }
    }
}
