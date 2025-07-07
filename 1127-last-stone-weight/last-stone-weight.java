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
            x = pq.peek();
            if (x == null)
                break;
            pq.poll();
            System.out.println("x" + x + "y" + y);
            if (x != y) {
                pq.add(y - x);
            }
            System.out.println(pq);
        }
        System.out.println("final"+pq.peek());
        return (pq.size()==1)?pq.poll():0;

    }
}