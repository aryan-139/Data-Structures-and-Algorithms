class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //insert to pq once, O(n)
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
        int max=Integer.MIN_VALUE; int rally=0; int identical=0;
        if(pq.size()==1) return 1;
        if(pq.size()==0) return 0; 
        int prev=pq.poll();
        while(!pq.isEmpty()){
            //System.out.println(pq.peek());
            int curr=pq.poll();
            System.out.println("prev"+ prev+ "curr"+ curr);
            if(prev==curr){
                prev=curr;
                identical++;
                continue;
            }

            if((curr-prev)==1)
            rally++;
            else
            rally=0;

            if(rally>max) max=rally;
            prev=curr;

            
        }
        System.out.println(identical);
        if((identical+1)==nums.length)
        max=0;
        return max+1; 
    }
}