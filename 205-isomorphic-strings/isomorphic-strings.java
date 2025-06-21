class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        HashSet<Character> set= new HashSet<>();
        HashMap<Character, Character> m= new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char ch1=s.charAt(i); char ch2= t.charAt(i);
            if (m.containsKey(ch1)) {
                if (m.get(ch1) != ch2) return false;
            } else {
                if (set.contains(ch2)) return false;
                m.put(ch1, ch2);
                set.add(ch2);
            }
        }
        System.out.println(set);
        return true; 
    }
}