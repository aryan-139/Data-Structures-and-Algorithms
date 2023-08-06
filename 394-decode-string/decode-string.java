import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public String decodeString(String s) {
        Deque<Character> dq=new LinkedList<>();
        for(char c: s.toCharArray()) dq.add(c);
        return helper(dq);        
    }
    private String helper(Deque<Character> queue){
        StringBuilder sb=new StringBuilder();
        int num=0;

        while(!queue.isEmpty()){
            char c=queue.poll();
            if(Character.isDigit(c)){
                num=num*10+c-'0';
            }
            else if(c=='['){
                String sub=helper(queue);
                for(int i=0;i<num;i++){
                    sb.append(sub);
                }
                num=0;
            }
            else if(c==']'){
                break;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}