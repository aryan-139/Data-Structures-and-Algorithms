class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length; 
        int memo[][]= new int[m][n];
        for(int []row: memo)
        Arrays.fill(row, -1);
        return solve(grid, 0, 0, memo);
    }
    public int solve(int [][]grid, int i, int j, int memo[][]){
        int m = grid.length;
        int n = grid[0].length;
        
        if(i>=m || j>=n)
        return Integer.MAX_VALUE;
        
        if((i==(m-1))&&(j==(n-1)))
        return grid[i][j];

        if (memo[i][j] != -1) return memo[i][j];

        int down= solve(grid, i+1, j, memo);
        int right= solve(grid, i, j+1, memo);

        memo[i][j]= grid[i][j] + Math.min(down, right);
        return memo[i][j];
    }
}