class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minVal = prices[0];
        for(int ele: prices) {
            minVal = Math.min(minVal, ele);
            maxProfit = Math.max(maxProfit, ele - minVal);
        }
        return maxProfit;
    }
}