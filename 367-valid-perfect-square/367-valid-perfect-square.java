class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 0; i * i >= 0 && i * i <= num; i ++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
        /*if(num==1)
            return(true);
        for(int i=1;i<=num/2;i++)
        {
            if(i*i==num)
                return(true);
        }
        return(false);*/
    }
}