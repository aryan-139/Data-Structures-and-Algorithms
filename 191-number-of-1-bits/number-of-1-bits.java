class Solution {
    public int hammingWeight(int n) {
        //return Integer.bitCount(n);
        int count=0; 
        while(n>0){
            if((1 & n)!=0)
            count++; 
            n=n>>1;
        }
        return count; 
    }
}