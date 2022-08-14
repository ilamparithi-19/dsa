package Strings;

import java.util.*;

public class LongestConsecutiveSubString {
    
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//          int l = 0, r = 0, result = 0;
//         Set<Character> charSet = new HashSet<>();
//         while(r < s.length()) {
//             if(!charSet.contains(s.charAt(r))) {
//                 charSet.add(s.charAt(r));
               
//                 result = Math.max(result, r - l + 1);
//                  r++;
//             }
//             else {
//                 charSet.remove(s.charAt(l)); 
//                 l++;
               
//             }
//         }
//         return result;

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
