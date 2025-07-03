import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        findPalPartitions(0, s, path, res);
        return res;
    }
    
    void findPalPartitions(int index, String s, List<String> path, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (checkPalindrome(s.substring(index, i + 1))) {
                path.add(s.substring(index, i + 1));
                findPalPartitions(i + 1, s, path, res);
                path.remove(path.size() - 1);
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
