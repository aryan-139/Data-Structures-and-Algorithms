import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        HashSet<Integer> freq=new HashSet<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        //now i have the frequency 
        int countOfCharacters=map.size();

        //iterate hashmap to store in hashset 
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            freq.add(entry.getValue());
        }
        if(freq.size()==countOfCharacters)
        return true;
        else
        return false;

    }
}