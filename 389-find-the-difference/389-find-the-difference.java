class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0,sum2=0;
        for(int i=0;i<t.length();i++){
            sum2+=(int)t.charAt(i);
        }
        for(int j=0;j<s.length();j++){
            sum1+=(int)s.charAt(j);
        }
        System.out.println(sum2-sum1);
        return((char)(sum2-sum1));
    }
}