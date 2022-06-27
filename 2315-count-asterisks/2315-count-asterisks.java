class Solution {
    public int countAsterisks(String s) {
     char ch='a';int c=0, p=0;
     int l=s.length();
        for(int i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='|')
                c++;
            if((ch=='*')&&(c%2==0))
                p++;
            else
                continue;
        }
        //
        return(p);
    }
}