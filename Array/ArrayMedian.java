class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int median = (l1+l2)/2;
        Boolean isOdd = false;
        if((l1+l2)%2 == 1) {
            isOdd = true;
            median++;
        }
        int cnt = 0;
        int p1 = 0;
        int p2 = 0;
        Boolean n1 = false;
        Boolean n2 = false;
        while(cnt <= median && p1 < l1 && p2 < l2) {
            if(nums1[p1] < nums2[p2]) {
                n1=true;
                n2 = false;
                p1++;
            }
            else {
                n1 = false;
                n2 = true;
                p2++;
            }
        }
        if(isOdd) {
            if(n1) {
                return new Double(nums1[p1]);
            }
            return new Double(nums2[p2]);
        }
        return new Double((nums1[p1]+nums2[p2])/2);
    }
}