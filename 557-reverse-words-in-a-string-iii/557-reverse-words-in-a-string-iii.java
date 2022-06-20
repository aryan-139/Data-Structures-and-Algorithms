class Solution {
    public String reverseWords(String s) {
        String fin="";int prev=0; String word=""; s=" "+s+ " ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            {word=s.substring(prev,i); prev=i;
            //reverse the word
            for(int j=word.length()-1;j>=0;j--){
                fin+=word.charAt(j);
            }}
            else
                continue;
        }
        return(fin.trim());
        
        
    }
}