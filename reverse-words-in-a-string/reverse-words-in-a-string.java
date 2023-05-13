import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        s += ' ';
        //adding a space after the last character so that it matches our code
        Stack<String> stack = new Stack<>();
        String revstr = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            //checks for space in code and when we have some value input in the temp 
            if (s.charAt(i) == ' ' && temp.length() > 0) {
                stack.add(temp);
                temp = "";
            } else if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            }
        }
        while (!stack.isEmpty()) {
            revstr += (stack.pop()).trim() + " ";
        }
        return revstr.trim();
    }
}
