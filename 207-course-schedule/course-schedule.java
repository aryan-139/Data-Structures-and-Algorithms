class Solution {
    private Map<Integer, List<Integer>> adj = new HashMap<>();
    private Set<Integer> visiting = new HashSet<>();
    private Set<Integer> visited = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Build the graph
        for (int i = 0; i < numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            adj.get(pre[0]).add(pre[1]);
        }

        // Run DFS for each course
        for (int c = 0; c < numCourses; c++) {
            if (!dfs(c)) return false;
        }
        return true;
    }

    private boolean dfs(int course) {
        if (visiting.contains(course)) return false;
        if (visited.contains(course)) return true;
        visiting.add(course);
        for (int neighbor : adj.get(course)) {
            if (!dfs(neighbor)) return false;
        }
        visiting.remove(course);
        visited.add(course);
        return true;
    }
}
