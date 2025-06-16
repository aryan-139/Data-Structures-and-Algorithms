class Solution {
    public String longestPalindrome(String s) {
        int resLen=0; int resInd=0;
        for(int i=0;i<s.length();i++){
            //for odd length, we expand from the middle 
            int l=i, r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if(r-l+1 >= resLen){
                    resInd= l;
                    resLen = r - l + 1;
                }
                l--;
                r++; 
            }
            //for even length 
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                if (r - l + 1 > resLen) {
                    resInd = l;
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return s.substring(resInd, resInd + resLen);
    }
}