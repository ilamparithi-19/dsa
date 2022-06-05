package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubSet {
    public static void main(String[] args) {
        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

    private static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int size) {
        ArrayList<Integer> subSetSum = new ArrayList<Integer>();
        subsetSol(0, arr, size, subSetSum, 0);
        return subSetSum;
    }
    private static void subsetSol(int ind, ArrayList<Integer> arr, int N, ArrayList<Integer> subsetSum, int sum) {
        if(ind == arr.size()) {
            subsetSum.add(sum);
            return;
        }
        subsetSol(ind+1, arr, N, subsetSum, sum + arr.get(ind));
        subsetSol(ind+1, arr, N, subsetSum, sum);

    }
}
