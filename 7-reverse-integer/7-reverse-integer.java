class Solution {
    public int reverse(int x) {
        long sum=0;long n=x;
        boolean isNegative=false;
        if(n<0)
        {isNegative=true;n=-n;}
        while(n!=0)
        {
            sum=sum*10+ n%10;
            n/=10;
        }
       if(sum>Integer.MAX_VALUE)
        return(0);
       return (int)(isNegative ? -sum : sum); 
    }
}
//edit