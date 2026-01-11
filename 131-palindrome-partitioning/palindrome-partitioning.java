import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        pal(0, s, path, res);
        return res;
    }
    
    void pal(int index, String s, List<String> p, List<List<String>>r){
        if(index==s.length()){
            r.add(new ArrayList<>(p));
            return;
        }
        for(int i=index; i<s.length(); i++){
            if(checkPalindrome(s.substring(index, i + 1))){
                //add sub
                 p.add(s.substring(index, i + 1));
                 pal(i+1, s, p, r);
                 //remove
                 p.remove(p.size()-1);
            }

        }
    }
    
    boolean checkPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
