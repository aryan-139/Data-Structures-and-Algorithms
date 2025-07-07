class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i : stones)
            pq.offer(i);
        if (pq.size() == 1)
            return pq.poll();
        Integer y=0;
        Integer x=0;
        while (pq.size() > 1) {
            y = pq.poll();
            x = pq.poll();
            if (x != y) {
                pq.add(y - x);
            }
            System.out.println(pq);
        }
        return (pq.size()==1)?pq.poll():0;

    }
}