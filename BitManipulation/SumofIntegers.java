// Sum of Two Integers - Leetcode 371 - Java

class Solution {
    // B is the carry value, Carry is generated using a&b left shifting it by 1
    public int getSum(int a, int b) {
        // if(b == 0) {
        //     return a;
        // }
        // return getSum(a ^ b , (a & b) << 1);
        while(b != 0) {
            int temp = (a ^ b);
            int a = (a & b) << 1;
            int b = temp;
        }
        return a;
    }
}
