class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length; 
        int n=grid[0].length; int max=0;
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                if(grid[i][j]==1)
                max=Math.max(max, dfs(grid, i, j));
            }
        }
        return max; 
    }
    public int dfs(int m[][], int i, int j){
        if(i<0 || j<0 || i>=m.length || j>=m[0].length || m[i][j]!=1)
        return 0; 
        
        m[i][j]=0;
        int area=1;
        area+=dfs(m, i+1, j);
        area+=dfs(m, i-1, j);
        area+=dfs(m, i, j+1);
        area+=dfs(m, i, j-1);
        return area;  
    }
}