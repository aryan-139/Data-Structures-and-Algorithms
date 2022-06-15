class Solution {
    public int lengthOfLastWord(String s) {
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if((Character.isLetter(s.charAt(i)))||(Character.isDigit(s.charAt(i))))
                str+=s.charAt(i);
            if((str.isEmpty()==false)&&(s.charAt(i)==' '))
                break;
        }
        return(str.length());
    }
}