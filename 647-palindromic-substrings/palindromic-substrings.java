class Solution {
    Boolean[][] memo;
    public int countSubstrings(String s) {
        memo= new Boolean[s.length()][s.length()];
        return solve(s, 0);
    }
    public int solve(String s, int i){
        int len=s.length(); int count=0; 
        if(i>=len) return 0;
        for(int j=i; j<len;j++){
            if(pal(s, i, j))
            count++;
        }
        return count+solve(s, i+1);
    }
    private boolean pal(String s, int l, int r){
        if(memo[l][r]!=null) return memo[l][r];
        if(s.length()==1)
        return true;
        while(l<r){
            if (s.charAt(l) != s.charAt(r)) {
                memo[l][r] = false;
                return false;
            }
            l++;
            r--;
        }
        memo[l][r] = true;
        return true;
    }
}