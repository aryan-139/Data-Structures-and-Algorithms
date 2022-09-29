// class Solution {
//     public double myPow(double x, int n) {
//         double prod=1;
//         if(n>0)
//         for(int i=1;i<=n;i++){
//             prod*=x;
//         }
//         else
//             for(int j=1;j<=Math.abs(n);j++){
//                 prod=1/x*prod;
//             }
//         return(prod);
//     }
// }
class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            return 1/x * myPow(1/x, -(n + 1));
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}