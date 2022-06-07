/*class Solution {
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        int sqrt=1;
        int mid=0;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            sqrt=mid*mid;
            if(sqrt==x)    
            return(mid);
            else if(sqrt>x)
                right=mid-1;
            else
                left=mid+1;
        }
        return((sqrt>x)?mid-1:mid);
        
    }
}*/
class Solution{
public int mySqrt(int x) {
    long i=0,j=x,mid=0,sqrt=0;
    while(i<=j){
        mid = (i+j)/2;
        sqrt = mid*mid;
        if(sqrt==x){
            break;
        }else if(sqrt>x){
            j=mid-1;
        }else if(sqrt<x){
            i=mid+1;
        }
    }
    return (int)(sqrt>x?mid-1:mid);
}}