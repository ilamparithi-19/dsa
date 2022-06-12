package Arrays;

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 1; int maj = nums[0];
        for (int i = 1; i < nums.length ; i++){
            // if(map.containsKey(num) && map.get(num) > (nums.length / 2)){
            //     return num;
            // }
            // else {
            //     map.put(num, map.getOrDefault(num, 1) + 1);
            // }
            if(maj == nums[i]) {
                count++;
            }
            else {
                count--;
            }
            if(count == 0) {
                maj = nums[i];
                count++;
            }
            
        }
        return maj;
    }
}