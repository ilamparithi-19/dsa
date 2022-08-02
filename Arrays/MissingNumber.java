class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0, sum2 = 0;
        
        for(int ele: nums) {
            sum1 += ele;
        }
        
        sum2 = (nums.length*(nums.length+1))/2;
        
        return sum2-sum1;
    }

    // if(nums.length == 0) {
    //     return -1;
    // }
    // int result = 0;
    // for(int i = 0 ; i < nums.length ; i++) {
    //     if(nums[i] != nums.length) {
    //         result = result ^ nums[i] ^ i;
    //     }
    // }
    // return result;

}
