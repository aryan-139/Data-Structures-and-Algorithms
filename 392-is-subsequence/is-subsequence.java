import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean isSubsequence(String s, String t) {
        Queue<Character> q=new LinkedList<>();
        for(char ch:s.toCharArray())
        q.add(ch);

        for(char check:t.toCharArray()){
            if(q.isEmpty())
            return true;
            if(q.peek()==check)
            q.poll();

        }
        if(q.isEmpty())
        return true;
        return false;
    }
}