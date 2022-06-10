package String;

import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<String>();
        String str = "";
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                stack.push(str);
                str = "";
            }
            else {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while(stack.size() != 1) {
            ans += stack.peek() + " ";
            stack.pop();
        }
        ans += stack.peek();
        return ans;
    }
}