import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int minReorder(int n, int[][] connections) {
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>(); // Adjacency list representation of the graph
        
        // Initialize the graph
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Populate the graph with connections
        for (int[] connection : connections) {
            graph.get(connection[0]).add(new int[]{connection[1], 1}); // Regular connection
            graph.get(connection[1]).add(new int[]{connection[0], 0}); // Reversed connection
        }
        
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0); // Start from node 0
        
        int count = 0;
        
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            visited[currentNode] = true;
            
            for (int[] neighbor : graph.get(currentNode)) {
                int neighborNode = neighbor[0];
                int direction = neighbor[1];
                
                if (!visited[neighborNode]) {
                    if (direction == 1) {
                        count++; // Need to reroute
                    }
                    queue.offer(neighborNode);
                }
            }
        }
        
        return count;
    }
}
