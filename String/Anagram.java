package String;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        
        int[] cntr = new int[256];
        if(ch1.length != ch2.length) {
            return false;
        }
        
        for(int i = 0; i < ch1.length; i++) {
            cntr[ch1[i]]++;
            cntr[ch2[i]]--;
        }
        for(int i : cntr) {
            if(i != 0) {
                return false;
            }
        }
            return true;
    }
}
