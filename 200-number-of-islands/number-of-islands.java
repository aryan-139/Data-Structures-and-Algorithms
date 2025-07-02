class Solution {
    public int numIslands(char[][] grid) {
        int vis[][]= new int[grid.length][grid[0].length];
        for(int i=0; i<vis.length; i++){
            for(int j=0; j<vis[0].length; j++){
                vis[i][j]=-1;
            }
        }
        int count=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if (grid[i][j] == '1' && vis[i][j] == -1) {
                    dfs(grid, vis, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char [][] grid, int[][] vis, int i, int j){
        int rows=grid.length; int cols=grid[0].length;
        if(i<0 || j<0 || i>=rows || j>=cols) return; 
        if(grid[i][j] == '0' || vis[i][j]!=-1) return; 
        vis[i][j]=1; 
        dfs(grid, vis, i+1, j);
        dfs(grid, vis, i-1, j);
        dfs(grid, vis, i, j+1);
        dfs(grid, vis, i, j-1);
    }
}