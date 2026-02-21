class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], 1 + map.getOrDefault(nums[i], 0));
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> map.get(a)- map.get(b));
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            pq.add(e.getKey());
            if(pq.size()>k)
            pq.poll();
        }
        int res[]= new int[k];
        for(int j=0; j<k; j++){
            res[j]=pq.poll();
        }
        return res;
    }
}