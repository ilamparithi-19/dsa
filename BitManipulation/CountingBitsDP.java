class CountingBitsDP {
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        int offset = 0;
        for(int i = 1; i <= n; i++) {
            if(i == offset *2) {
                offset = i;
            }
            dp[i] = 1 + dp[i-offset];
        }
        return dp;
    }
}