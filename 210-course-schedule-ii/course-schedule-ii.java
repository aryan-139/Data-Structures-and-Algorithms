class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        //create the graph 
        for (int pair[] : prerequisites) {
            graph.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
        }
        List<Integer> order = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Set<Integer> visiting = new HashSet<>();
        //cycle detection logic and handling 
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, graph, visited, visiting, order))
                return new int[0];
        }
        int[] result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            result[i] = order.get(i);
        }
        return result;
    }

    public boolean dfs(int course, Map<Integer, List<Integer>> graph, Set<Integer> visited, Set<Integer> visiting,
            List<Integer> order) {
        if(visited.contains(course))
        return true;
        if(visiting.contains(course))
        return false; 
        visiting.add(course);
        for (int prereq : graph.getOrDefault(course, Collections.emptyList())) {
            if (!dfs(prereq, graph, visited, visiting, order)) return false;
        }
        visiting.remove(course);
        visited.add(course);
        order.add(course);
        return true; 
    }
}