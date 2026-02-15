class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> r= new ArrayList<>(); 
        HashMap<Integer, Boolean> map=new HashMap<>(); 
        for(int it: bulbs){
            if(map.get(it)!=null)
            map.put(it, !map.get(it)); 
            else
                map.put(it, true);
        }
        //iterate over map, add to list 
        for(Map.Entry<Integer, Boolean> entry: map.entrySet()){
            if(entry.getValue()==true){
                r.add(entry.getKey());
            }
        }
        Collections.sort(r);
        return r; 
    }
}