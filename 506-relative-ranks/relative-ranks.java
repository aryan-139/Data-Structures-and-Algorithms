class Solution {
    public String[] findRelativeRanks(int[] score) {
        //max heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(int i=0; i<score.length; i++){
            pq.add(new int [] {score[i], i});
        }
        String s[]= new String[score.length];
        int rank=1;
        while(!pq.isEmpty()){
            int[] val=pq.poll();
            System.out.println(val[0]+" "+val[1]);
            if(rank==1)
            s[val[1]]="Gold Medal";
            else if(rank==2)
            s[val[1]]="Silver Medal";
            else if(rank==3)
            s[val[1]]="Bronze Medal";
            else
            s[val[1]]=Integer.toString(rank);

            rank++;
        }
        
        return s;
    }
}