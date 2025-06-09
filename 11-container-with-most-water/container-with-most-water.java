class Solution {
    public int maxArea(int[] h) {
        int max=0;
        int l=0; 
        int r=h.length-1; 
        while(l<r){
            if(Math.min(h[l],h[r])*(r-l)>max)
            max=Math.min(h[l],h[r])*(r-l);

            if(h[l]<h[r])
            l++;
            else{
                r--;
            }
        }
        return max;
    }
}