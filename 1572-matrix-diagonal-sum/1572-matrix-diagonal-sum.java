class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    if(i==j)
                    {sum+=mat[i][j];sum+=mat[i][mat.length-1-j];}
                }
            }
        if((mat.length%2!=0))
        return(sum-mat[mat.length/2][mat.length/2]);
        else
            return(sum);
        
    }
}