class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word3="";
        int l1=word1.length();
        int l2=word2.length();char ch1='a',ch2='a';
        for(int i=0;i<((l1<l2)?l1:l2);i++){
            ch1=word1.charAt(i); ch2=word2.charAt(i);
            word3+= ch1;
            word3+=ch2;
        }
        if(((l1<=l2)?l1:l2)==l1){
            word3+=word2.substring(l1,l2);
        }
        else
            word3+=word1.substring(l2,l1);
        
        return(word3);
    }
}