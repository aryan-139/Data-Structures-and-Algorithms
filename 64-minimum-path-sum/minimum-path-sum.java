class Solution {
    public int minPathSum(int[][] grid) {
        int [][]memo= new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                memo[i][j]=-1; 
            }
        }
        return dp(grid,0, 0, memo);
    }
    private int dp(int[][] grid, int i, int j, int[][]memo){
        if(i>=grid.length || j>=grid[0].length) return Integer.MAX_VALUE;
        if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j]; 
        if(memo[i][j]!=-1) return memo[i][j]; 
        int down= dp(grid, i+1, j, memo);
        int right=dp(grid, i, j+1, memo);
        memo[i][j]= grid[i][j]+ Math.min(down, right);
        return memo[i][j];

    }
}