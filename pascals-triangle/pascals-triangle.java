import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows <= 0) {
            return triangle;
        }
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> previousRow = triangle.get(i - 1);
                    int sum = previousRow.get(j - 1) + previousRow.get(j);
                    row.add(sum);
                }
            }
            triangle.add(row);
        }
        
        return triangle;
    }
}
