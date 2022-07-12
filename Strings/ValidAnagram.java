class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int[] charArr = new int[256];
        for(int i = 0; i < s1.length; i++) {
            charArr[s1[i]]++;
            charArr[s2[i]]--;
        }
        for(int ele: charArr) {
            if(ele != 0) {
                return false;
            }
        }
         return true;
    
//        int[] charArr =new int[26];
//         for(char c : s.toCharArray()){
             
//         }
           
//         for(char c : t.toCharArray()){
//              charArr[c-'a']--;
//         }
           
//         for(int a : f)
//         {
//              if(a!=0)
//                 return false;
//         }
//         return true;
    }
}
