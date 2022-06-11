package DynamicProgramming;

import java.util.Arrays;

public class Fibbonacci {
    public static void main(String[] args) {
        int[] arr = new int[11];
        // Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fib(9, arr)+"fact result");
    }
    // Method 1, Memoization
    // private static int fact(int i, int[] js) {
    //     if(i <= 1) {
    //         return i;
    //     }
    //     if(js[i]  != -1) {
    //         return js[i];
    //     }
    //     return js[i] = fact(i-1, js) + fact(i-2, js);
    // }

    //method 2, tabulation Bottom up
    private static int fact(int n, int[] arr) {
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i-2];
        }
        return arr[n];
    }

    //space optimizatiopn 
    private static int fib(int n, int[] arr) {
        int prev = 1, prev1 = 0;
        for(int i = 2; i <= n; i++) {
            arr[i] = prev + prev1;
            prev1 = prev;
            prev = arr[i];
        }
        return arr[n];
    }

}
