package DynamicProgramming;


/*
 * 70. Climbing Stairs
Easy

12138

371

Add to List

Share
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 https://www.youtube.com/watch?v=Y0lT9Fck7qI
 
 THis is more like a fibonacci sequence
 Bottom up Dynamic programming
 */

public class ClaimingStairs {
    public static void main(String[] args) {
        System.out.println(maxStairsClaim(5));
    }

    private static int maxStairsClaim(int n) {
        int prev = 1 , prev1 = 1;
        for(int i = n-2; i >= 0; i--) {
            int temp = prev + prev1;
            prev1 = prev;
            prev = temp;
        }
        return prev;
    }
    
}
