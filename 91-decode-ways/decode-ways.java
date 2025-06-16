class Solution {
    public int numDecodings(String s) {
        Integer[] memo = new Integer[s.length()];
       return decode(s, 0, memo);
    }
    public int decode(String s, int i, Integer memo[]){
        if(i==s.length())
        return 1;
        if(s.charAt(i)=='0')
        return 0; 
        if (memo[i] != null) return memo[i];
        //take one digit first
        int ways= decode(s, i+1, memo);
        //take 2 digit next
        if(i+1<s.length()){
            int num=Integer.parseInt(s.substring(i, i+2));
            if(num>=10 && num<=26)
            ways+= decode(s, i+2, memo);
        }
        memo[i] = ways;
        return ways;
    }
}