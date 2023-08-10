import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        Arrays.fill(vis, false);
        
        dfs(0, rooms, vis); // Start DFS from room 0
        
        for (boolean j : vis) {
            if (j == false) {
                return false;
            }
        }
        return true;
    }
    
    // DFS function
    private void dfs(int node, List<List<Integer>> rooms, boolean[] vis) {
        vis[node] = true;
        for (int neighbour : rooms.get(node)) {
            if (!vis[neighbour]) {
                dfs(neighbour, rooms, vis);
            }
        }
    }
}
