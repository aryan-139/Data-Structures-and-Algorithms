class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l=0;
        int l1=word1.length();
        int l2=word2.length();
        String ans="";
        int i=0,j=0;
        l=Math.max(l1, l2);
        while(l!=0){
            if(l1!=0){
                ans+=word1.charAt(i);
                i++; 
                l1--;
            }
            if(l2!=0){
                ans+=word2.charAt(j);
                j++;
                l2--;
            }
            l--;
        }
        return ans;
    }
}