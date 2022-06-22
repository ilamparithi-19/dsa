    class Solution {
        public boolean isPalindrome(String s) {
           
            s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
            int i = 0;
            int len = s.length() - 1;
            while(i < len) {
                if(s.charAt(i) != s.charAt(len)){
                    return false;
                }
                else {
                    i++;
                    len--;
                }
            }
            return true;
        }
    }
