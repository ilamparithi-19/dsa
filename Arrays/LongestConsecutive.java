package Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int n: nums) {
            numSet.add(n);
        }
        int maxLen = 1;
        for(int i = 0 ; i < nums.length; i++) {
            if(!numSet.contains(nums[i] - 1)) {
                maxLen = 1;
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
