class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0, sum2 = 0;
        
        for(int ele: nums) {
            sum1 += ele;
        }
        
        sum2 = (nums.length*(nums.length+1))/2;
        
        return sum2-sum1;
    }
}
