package BinarySearch;

class NRootOfM {
    public static int findSingleElement(int nums[]) {
        // int n = nums.length;
        // int elem = 0;
        // for (int i = 0; i < n; i++) {
        //     elem = elem ^ nums[i];
        // }

        // return elem;

            // int i;
        // for(int e: nums) {
        //     i = i ^ e;
        // }   
        // return i;
                /*
                 * Solution 1 is above
                 */

        if(nums.length == 1) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 2;
        int mid;
        // while(left <= right) {
        //     middle = (left + right) / 2;
        //         if((middle % 2 == 0 && nums.length - 1 > middle + 1) ? (nums[middle] == nums[middle + 1]) : 
        //           (nums[middle] == nums[middle - 1])) {
        //             left = middle + 1;
        //         }
        //         else {
        //             if(nums.length - 1 > middle + 1 ? (nums[middle] != nums[middle + 1] && nums[middle] != nums[middle - 1]): false)
        //             {
        //                 return nums[middle];
        //             }
        //             right = middle;
        //         }
        // }
        // return 0;
        while(left <= right) {
            mid = (left + right) >> 1;
            if(nums[mid] == nums[mid ^ 1]) { //XOR give previous even number if value is odd and gives next odd if value is even
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return nums[left];
    }

    public static void main(String args[]) {

        int arr[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };

        int elem = findSingleElement(arr);
        System.out.println("The single occurring"
                + " element is " + elem);

    }
}