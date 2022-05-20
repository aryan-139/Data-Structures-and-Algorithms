class Solution {
    public boolean isHappy(int n) {
        int d;int sum=0;
        while(n!=0)
        {
            d=n%10;
            sum+=d*d;
            n/=10;
        }
        //explicitly mentioned that it should be equal to 1 or 7
        if((sum==1)||(sum==7))
            return(true);
        else if(sum>9)
        {
            return(isHappy(sum));
        
        }
        else
            return(false);
           
    }
}