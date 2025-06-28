class Solution {
    public int numIslands(char[][] grid) {
        int count=0; 
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                //look for 1 and fill the matrix with V everywhere where it is a connected component
                if(grid[i][j]=='1'){
                    dfs(grid, i, j); 
                    count+=1; 
                }
            }
        }
        return count; 
    }

    public void dfs(char m[][], int i, int j){
        if(i<0 || j<0 || i>=m.length || j>=m[0].length || m[i][j]!='1') 
        return; 
        m[i][j]='V';
        dfs(m, i+1, j);
        dfs(m, i-1, j);
        dfs(m, i, j+1);
        dfs(m, i, j-1);
    }
}