class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1; 
        while(l<r){
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(!Character.isLetterOrDigit(ch1)){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch2)){
                r--;
                continue;
            }
            ch1=Character.toLowerCase(ch1);
            ch2=Character.toLowerCase(ch2);
            System.out.println(ch1 + " " + ch2);
            if(ch1!=ch2)
            return false;
            l++;
            r--;
        }
        return true;
    }
}