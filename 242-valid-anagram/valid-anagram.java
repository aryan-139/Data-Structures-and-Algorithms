class Solution {
    public boolean isAnagram(String s, String t) {
        //base case
        if(s.length()!=t.length())
        return false;

        //edge case 
        if((s.length()==0)&&(t.length()==0))
        return true;

        HashMap <Character, Integer> map=new HashMap<>();
        HashMap <Character, Integer> map2=new HashMap<>();

        //add characters to the HashMap 
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            char ch2 =t.charAt(i);

            //add the characters to Map 1
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            } else{
                map.put(ch, 1);
            }

            //add the characters to Map2 
            if(map2.containsKey(ch2)){
                map2.put(ch2, map2.get(ch2)+1);
            }else{
                map2.put(ch2, 1);
            }
        }
        //compare the 2 HashMaps
        if(map.equals(map2))
        return true;
        else
        return false;
    }
}