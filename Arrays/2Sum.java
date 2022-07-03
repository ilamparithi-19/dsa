class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        int numLen = nums.length;
        for (int i = 0 ; i <  numLen ; i++) {
            int pair = target - nums[i];
            if(numMap.containsKey(pair)){
                return new int[] {numMap.get(pair), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{0,0};
        
        // Arrays.sort(nums);
        // int left = 0; 
        // int right = nums.length -  1;
        // while(right > left) {
        //     if(nums[left] + nums[right] == target)  {
        //         return new int[]{left, right};
        //     }
        //     else if(nums[left] + nums[right] < target) {
        //         left++;
        //     }
        //     else {
        //         right--;
        //     }
        // }
        // return new int[]{0};
    }
}