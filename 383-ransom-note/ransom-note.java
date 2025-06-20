class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //add all letters of magazine (key, value pair) (character, count)
        //if some char not present-> false else true
        //time complexity O(n) -n=length(Math.max(ransomNote.length(), magazine.length()))
        HashMap<Character, Integer> m= new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            m.put(magazine.charAt(i), m.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for(int j=0; j<ransomNote.length(); j++){
            if (!m.containsKey(ransomNote.charAt(j)) || m.get(ransomNote.charAt(j)) == 0) {

                return false;
            }
            m.put(ransomNote.charAt(j), m.get(ransomNote.charAt(j))-1);
        }
        return true; 
    }
}