import java.util.LinkedList;
import java.util.Stack;
//this could have been solve d using stringbuilder class only 
class Solution {
    public String removeStars(String s) {
        Stack<Character> backspace=new Stack<>();
        //add to stack 
        for(char i:s.toCharArray()){
            backspace.add(i);
        }
        StringBuilder res=new StringBuilder();
        //check for stars 
        int countStar=0;
        while(!backspace.isEmpty()){
            if(backspace.peek()=='*'){
                countStar++;
                backspace.pop();
            }
            else if((countStar!=0)&&(Character.isLetter(backspace.peek()))){
                backspace.pop();
                countStar--;
            }
            else{
                res.append(backspace.peek());
                backspace.pop();
            }
        }
        return res.reverse().toString();

    }
}