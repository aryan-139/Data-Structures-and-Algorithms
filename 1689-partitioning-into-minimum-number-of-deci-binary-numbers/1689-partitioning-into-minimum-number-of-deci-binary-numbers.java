class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            //we are finding the maximum digit value and it will neutralise in the next iteration
            int ch=(int)n.charAt(i)-(int)'0';
            max=Math.max(max,ch);
        }
        return max;      
    }
}