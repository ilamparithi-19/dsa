package String;

import java.util.Stack;

// class Solution {
//     public String reverseWords(String s) {
//         Stack<String> stack = new Stack<String>();
//         String str = "";
//         for(int i = 0 ; i < s.length(); i++) {
//             if(s.charAt(i) == ' ') {
//                 stack.push(str);
//                 str = "";
//             }
//             else {
//                 str += s.charAt(i);
//             }
//         }
//         if(str.length() > 0) {
//             stack.push(str);
//                 str = "";
//         }
//         String ans = "";
//         while(stack.size() != 1) {
//             ans += stack.peek() + " ";
//             stack.pop();
//         }
//         ans += stack.peek();
//         return ans;
//     }
// }

class Solution {

    public static void main(String[] args) {
       System.out.println( reverseWords("  Hello World   "));
    }
    private static String reverseWords(String s) {

        int left = 0;
        int right = s.length() -1;
        
        String ans= "";
        String temp = "";
        while(left <= right) {
            char ch = s.charAt(left); 
            if(ch != ' ') {
                temp += ch;
            }
            else if(ch == ' ' ){
                if(!ans.equals("")) {
                    ans = temp + " " + ans;
                }
                else {
                    ans = temp;
                }
                temp = "";
            }
            left++; 
        }
        if(temp != "") {
            ans = temp + " " + ans;
        }
        
        // ans = temp + ans;
        
        return ans;
    }
}