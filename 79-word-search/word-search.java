import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int index, boolean[][] visited) {
        if (index == word.length()) return true;

        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length ||
                board[r][c] != word.charAt(index) || visited[r][c]) {
            return false;
        }

        visited[r][c] = true;

        boolean result =
            dfs(board, word, r + 1, c, index + 1, visited) ||
            dfs(board, word, r - 1, c, index + 1, visited) ||
            dfs(board, word, r, c + 1, index + 1, visited) ||
            dfs(board, word, r, c - 1, index + 1, visited);

        visited[r][c] = false;

        return result;
    }
}
