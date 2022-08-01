package Arrays.Medium;

public class MinInRotatedArray {
        public int findMin(int[] nums) {
            if(nums.length == 0) 
                return -1;
            if(nums.length == 1) {
                return nums[0];
            }
            int result = nums[0];
            int l = 0, r = nums.length - 1;
            
            while(l <= r) {
                if(nums[l] < nums[r]) {
                    result = Math.min(nums[l], result);
                    break;
                }
                int m = l + ((r - l) / 2);
                if(nums[m] < nums[l]) {
                    result = Math.min(result, nums[m]);
                    r = m -1;
                }
                else {
                    result = Math.min(nums[l], result);
                    l = m+1;
                }
            }
            return result;
        }
    }

