

class Solution {
    public void rotate(int[][] matrix) {
        int temp;
        //since we have to rotate the matrix and not take another array, we can do substitutions instead 
        // the idea here is to transpose the matrix first then flip it 
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i;j<matrix.length;j++)
            {
                temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //flipping the matrix
        for(int m=0;m<matrix.length;m++)
        {
            for(int n=0;n<matrix.length/2;n++)
            {
                temp=0;
                temp=matrix[m][n];
                matrix[m][n]=matrix[m][matrix.length-1-n];
                matrix[m][matrix.length-1-n]=temp;
            }
        }
        
    }
}