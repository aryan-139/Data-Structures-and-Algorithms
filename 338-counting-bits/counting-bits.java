class Solution {
    public int[] countBits(int n) {
        int[] set= new int[n+1];
        for(int i=0; i<=n; i++){
            set[i]=Integer.bitCount(i);
        }
        return set;  
    }
}