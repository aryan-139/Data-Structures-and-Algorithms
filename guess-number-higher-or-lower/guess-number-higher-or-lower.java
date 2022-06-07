/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
/*
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=1, j=n, mid=0;
        while(i<=j)
        {
            mid=i+(j-i)/2;
            int resp=guess(mid);
            if(resp==0)
                break;
            else if(resp==1)
                i=i+1;
            else if(resp==-1)
                j=j-1;
        }
        return(mid);
        }
}
*/
public class Solution extends GuessGame {
    
public int guessNumber(int n) {
    int i=1,j=n,mid=0;
    while(i<=j){
        mid = i+(j-i)/2;
        int resp = guess(mid);
        if(resp==0){
            break;
        }else if(resp==1){
            i=mid+1;
        }else if(resp==-1){
            j=mid-1;
        }
    }
    return mid;
}
}