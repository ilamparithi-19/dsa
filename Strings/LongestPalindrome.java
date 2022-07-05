class Solution {
    public String longestPalindrome(String s) {
        if(s == null && s.length() < 1) return "";
        int maxLen, start, end;
         maxLen = start = end = 0;
        for(int i = 0 ; i < s.length(); i++) {
            int len = palindromeFromMiddle(s, i, i);
            int len1 = palindromeFromMiddle(s, i, i+1);
            maxLen = Math.max(len, len1);
            if(maxLen > end - start) {
                start = i - ((maxLen - 1) / 2);
                end = i + (maxLen / 2);
            }    
        }
        return s.substring(start, end+1);
        
    }
    
    private int palindromeFromMiddle(String s, int left, int right) {
        if(s == null || left > right) return 0;
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}