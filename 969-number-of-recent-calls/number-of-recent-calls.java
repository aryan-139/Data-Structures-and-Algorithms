import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> pings;

    public RecentCounter() {
        pings = new LinkedList<>();
    }

    public int ping(int t) {
        // Remove pings that are older than 3000 milliseconds (3 seconds)
        while (!pings.isEmpty() && pings.peek() < t - 3000) {
            pings.poll();
        }

        // Add the current ping to the queue
        pings.offer(t);

        // Return the number of pings within the last 3000 milliseconds
        return pings.size();
    }
}
