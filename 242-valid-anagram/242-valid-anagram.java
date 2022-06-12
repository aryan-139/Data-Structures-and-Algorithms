class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return(false);
        int m[]= new int[s.length()];
        int n[]=new int[t.length()];
        for(int i=0;i<m.length;i++){
            m[i]=(int)s.charAt(i); n[i]=(int)t.charAt(i);
        }
        Arrays.sort(m); Arrays.sort(n);
        if(Arrays.equals(m,n))
            return(true);
        else
            return(false);
        
    }
}