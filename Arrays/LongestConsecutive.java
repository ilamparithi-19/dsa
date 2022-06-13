package Arrays;

import java.util.HashSet;
import java.util.Set;

class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n: nums) {
            numSet.add(n);
        }
        int maxLen = 1;
        for(int i = 0 ; i < nums.length; i++) {
            if(!numSet.contains(nums[i] - 1)) {
                maxLen = Math.max(maxLen, 1);
                int k = i;
                while(k < nums.length &&numSet.contains(nums[k])) {
                    maxLen++;
                    k++;
                }
            }
            
        }
        return maxLen;
    }
}
