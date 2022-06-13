class Solution {
    public boolean isPalindrome(String s) {
        String s2=""; char ch='a';String s3="";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(Character.isAlphabetic(ch)||(Character.isDigit(ch)))
                s3+=ch;}
        s2= s3.toLowerCase();
        System.out.print(s2);
        for(int i=0;i<s2.length()/2;i++){
            if(s2.charAt(i)!=s2.charAt(s2.length()-1-i))
                return(false);
        }
            return(true);
        }
        
    }
