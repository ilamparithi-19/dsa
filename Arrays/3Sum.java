class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0 ;  i < nums.length - 2; i ++) {
            HashSet<Integer> set = new HashSet<>();
             for(int j = i+1; j < nums.length; j++) {
                int complement = -(nums[i] + nums[j]);
                if(set.contains(complement)) {
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    tempList.add(complement);
                    Collections.sort(tempList);
                    if(!result.contains(tempList)) {
                        result.add(tempList);
                    }
                    
                }
                 else {
                     set.add(nums[j]);
                 }
                 
            }
            
        }
        return result;
        
        // Arrays.sort(nums);
        // for(int i = 0 ; i < nums.length - 2; i++) {
        //     int l = i + 1;
        //     int r = nums.length - 1;
        //     while (l < r) {
        //         if(nums[i] + nums[l] + nums[r] == 0) {
        //             List<Integer> temp = new ArrayList<>();
        //             temp.add(nums[i]);
        //             temp.add(nums[l]);
        //             temp.add(nums[r]);
        //             result.add(temp);
        //         }
        //         else if(nums[i] + nums[l] + nums[r]  > 0)  {
        //             r--;
        //         }
        //         else {
        //             l++;
        //         }
        //     }
        // }
        // return result;
        
    }
}