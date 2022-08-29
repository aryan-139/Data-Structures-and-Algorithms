// class Solution {
//     public boolean isValid(String s) {
//         Queue <Character> q= new PriorityQueue<Character>();
//         boolean flag=false;
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if((s.charAt(i)==('('))||(s.charAt(i)==('{'))||(s.charAt(i)==('[')))
//             {q.add(s.charAt(i));}
//             if((ch==')')&&(q.peek()=='('))    
//             {q.remove();flag=true;}
//             else return false;
//             if((ch=='}')&&(q.peek()=='{'))    
//             {q.remove();flag=true;}
//             else return false;
//             if((ch==']')&&(q.peek()=='['))    
//             {q.remove();flag=true;}
//             else return false;
//         }
//         return(true);
//     }
// }
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') stack.push(ch);
            else if(stack.empty()) return false;
            else if(ch == ')' && stack.pop() != '(') return false;
            else if(ch == ']' && stack.pop() != '[') return false;
            else if(ch == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }
}