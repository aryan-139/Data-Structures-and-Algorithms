class KthLargest {
    PriorityQueue<Integer> pq; 
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k; 
        pq=new PriorityQueue<>();
        for(int i: nums) add(i);
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size()>k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */