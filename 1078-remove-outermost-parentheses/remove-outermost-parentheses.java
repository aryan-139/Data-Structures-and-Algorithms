class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer r= new StringBuffer(""); int l=0;
        for(char ch: s.toCharArray()){
            if(ch=='(') {
                if(l>0) r.append(ch);
                l++;
            }else{
                l--;
                if(l>0) r.append(ch);
            }
        }
        return r.toString();
    }
}