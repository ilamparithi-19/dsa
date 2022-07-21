package Arrays;

import java.util.HashSet;
import java.util.Set;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1) return 0;
        Set<Integer> numSet = new HashSet<>();
        for(int n: nums) {
            numSet.add(n);
        }
        int maxLen = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(!numSet.contains(nums[i] - 1) && numSet.contains(nums[i])) {
                int tempLen = 0;
                int k = nums[i];
                while(numSet.contains(k)) {
                    tempLen++;
                    k++;
                }
                maxLen = Math.max(tempLen, maxLen);
            }
            
        }
        return maxLen;
    }
}
