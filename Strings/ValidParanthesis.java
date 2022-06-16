package Strings;

import java.util.Stack;

class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if( c == '[' || c == '{' || c == '(') {
                bracketStack.push(c);
            }
            else if( c == ']' && !bracketStack.isEmpty() && bracketStack.peek() == '[') {
                bracketStack.pop();
            }
            else if( c == '}' && !bracketStack.isEmpty() && bracketStack.peek() == '{') {
                bracketStack.pop();
            }
            else if( c == ')' && !bracketStack.isEmpty() && bracketStack.peek() == '(') {
                bracketStack.pop();
            }
            else{
                return false;
            }
        }
        return bracketStack.isEmpty();  
    }
}