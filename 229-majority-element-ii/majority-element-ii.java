class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        List<Integer> l= new ArrayList<>();
        for(int i:nums){
            map.put(i, 1+map.getOrDefault(i,0));
            if((map.get(i)>(nums.length/3))&& !l.contains(i))
            l.add(i);
        }
        System.out.print(l);
        return l;
    }
}