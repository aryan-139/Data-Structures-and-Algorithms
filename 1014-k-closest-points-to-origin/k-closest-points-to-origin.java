class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //write the comparator
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(dist(b[0], b[1]), dist(a[0], a[1]))
        );
        //add the points while discarding the points greater than the required length
        for (int[] p : points) {
            pq.offer(p);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        //store the value in result 
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
    private double dist(int x, int y){
        return x*x+y*y;
    }
}