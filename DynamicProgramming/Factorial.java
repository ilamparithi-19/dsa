package DynamicProgramming;

import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        int[] arr = new int[11];
        Arrays.fill(arr, -1);
        System.out.println(fact(9, arr)+"fact result");
    }

    private static int fact(int i, int[] js) {
        if(i <= 1) {
            return i;
        }
        if(js[i]  != -1) {
            return js[i];
        }
        return js[i] = fact(i-1, js) + fact(i-2, js);
    }

}
