import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        //first i am simply creating the result arraylist
        backtrack("", 0, 0, n, result);
        //then a backtrack function is created which keeps the tab of the total number of open and closed parenthesis
        //our objective is that the total number of closed parenthesis at any point of time must be less than that of open and the total number of open parenthesis must be less than the max that it can containˀˀ
        return result;
    }

    private void backtrack(String current, int open, int close, int max, List<String> result) {
        //base case
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(current + "(", open + 1, close, max, result);
        }

        if (close < open) {
            backtrack(current + ")", open, close + 1, max, result);
        }
    }
}
