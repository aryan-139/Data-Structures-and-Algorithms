import java.util.HashSet;
import java.util.Set;

class Solution {
    public void setZeroes(int[][] matrix) {
        // intuition is to basically have 2 HashSets working here
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        // Traverse the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        // Clear the marked rows
        for (int row : rows) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }

        // Clear the marked columns
        for (int col : cols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}
