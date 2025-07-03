class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> set= new ArrayList<>();
        Arrays.sort(candidates);
        solve(set, candidates, target, new ArrayList<>(), 0);
        return set;
    }
    private void solve(List<List<Integer>> set, int [] c, int target, List<Integer> l ,int i){
        if(target==0){
            set.add(new ArrayList<>(l));
            return;
        }
        for(int j=i; j<c.length; j++){
            if(j>i && (c[j]==c[j-1])) continue;
            if(c[j]>target) break;
            l.add(c[j]);
            solve(set, c, target-c[j], l, j+1);
            l.remove(l.size()-1);
        }
    }
}