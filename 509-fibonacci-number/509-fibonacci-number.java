class Solution {
    public int fib(int n) {
        if(n==1)
            return(1);
        if(n==0)
            return(0);
        int p=0, f=1, sum=0;
        for(int i=2;i<=n;i++)
        {
            sum=p+f;
            p=f;
            f=sum;
        }
        return(sum);
        
    }
}