class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map= new HashMap<>();
        Stack<Character> st= new Stack<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        //now iterate the entire string 
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                st.add(ch);
            }else{
                if (st.isEmpty() || map.get(st.pop()) != ch) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}