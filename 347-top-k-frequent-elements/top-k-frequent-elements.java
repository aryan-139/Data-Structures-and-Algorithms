class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1 + map.getOrDefault(nums[i], 0));
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll(); 
            }
        }
        
        int res[]= new int[k]; int i=0;
        while(!pq.isEmpty()){
            res[i]=pq.poll().getKey();
            i++;
        }
        System.out.println(res.toString());

        return res;
    }
}