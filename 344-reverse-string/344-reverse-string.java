class Solution {
    public void reverseString(char[] s) {
        char temp='a'; int i=0;int j=s.length-1;
        while(i<j)
        {
            temp=s[j];
            s[j]=s[i];
            s[i]=temp;
            i++;
            j--;
        }
        
    }
}