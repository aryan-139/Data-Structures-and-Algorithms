import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n]; // Track visited nodes

        // Convert adjacency matrix to adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }

        int numComponents = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                numComponents++;
                dfs(i, adj, visited);
            }
        }

        return numComponents;
    }

    // Depth-First Search to mark all connected nodes as visited
    private void dfs(int node, List<List<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited);
            }
        }
    }
}
