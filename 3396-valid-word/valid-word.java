class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        return false; 
        boolean vowel=false;
        boolean consonant=false; int vc=0, cc=0;
        for(char ch: word.toCharArray()){
            int asc=(int)ch;
            if(Character.toLowerCase(ch)=='a'||
            Character.toLowerCase(ch)=='e'||
            Character.toLowerCase(ch)=='i'||
            Character.toLowerCase(ch)=='o'||
            Character.toLowerCase(ch)=='u'){
                vc++; vowel=true;
            }
            if((asc>=97 && asc<=122) || (asc>=65 && asc<=90)){
                consonant=true; cc++; 
            }
            else if(asc>=48 && asc<=57)
            continue; 
            else
            return false;
        }
        if(vc==cc)
        return false;
        return vowel && consonant;
    }
}