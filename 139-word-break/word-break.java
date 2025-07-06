class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return dfs(s, 0, dict, memo);
    }

    private boolean dfs(String s, int start, Set<String> dict, Boolean[] memo) {
        if (start == s.length()) return true;
        if (memo[start] != null) return memo[start];

        for (int end = start + 1; end <= s.length(); end++) {
            String sub = s.substring(start, end);
            if (dict.contains(sub) && dfs(s, end, dict, memo)) {
                return memo[start] = true;
            }
        }

        return memo[start] = false;
    }
}
