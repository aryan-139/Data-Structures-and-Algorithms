class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q= new LinkedList<>();
        int fresh=0;
        //add all the rotten oranges and also count the fresh oranges for the last return 
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2)
                q.add(new int[]{i, j});
                else if(grid[i][j]==1)
                fresh++;
            }
        }
        int minutes=0; 
        if(fresh==0) return 0; 
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        //all rotten oranges are added to the q
        while(!q.isEmpty()){
            int size=q.size();
            boolean rottedThisMinute=false; 
            for(int i=0; i<size; i++){
                int [] cell= q.poll();
                int x=cell[0]; int y=cell[1];
                 for(int [] dir: directions){
                    int nx=x+dir[0]; int ny=y+dir[1];
                    //if there is a fresh orange, rot it this minute 
                    if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length && grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        rottedThisMinute=true; 
                        fresh--; 
                        q.add(new int[]{nx, ny});
                    }
                 }
            }
            if(rottedThisMinute){
                minutes++; 
            }
        }
        return fresh==0? minutes: -1; 
    }
}