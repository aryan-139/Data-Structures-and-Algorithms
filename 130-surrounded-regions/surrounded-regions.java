class Solution {
    boolean captured;

    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    captured = true;
                    dfs(board, i, j);

                    for (int x = 0; x < rows; x++) {
                        for (int y = 0; y < cols; y++) {
                            if (board[x][y] == '#') {
                                board[x][y] = captured ? 'X' : 'O';
                            }
                        }
                    }
                }
            }
        }
    }

    public void dfs(char[][] b, int i, int j) {
        int rows = b.length, cols = b[0].length;
        if (i < 0 || j < 0 || i >= rows || j >= cols || b[i][j] != 'O') return;

        if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
            captured = false;
        }

        b[i][j] = '#';

        dfs(b, i + 1, j);
        dfs(b, i - 1, j);
        dfs(b, i, j + 1);
        dfs(b, i, j - 1);
    }
}
