class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> r = new ArrayList<>();
        check(0, candidates, r, target, new ArrayList<>());
        return r;
    }
    private void check(int ind, int [] candidates , List<List<Integer>>r, int target, List<Integer> ds ){
        if(target<0) return;
        if(ind> candidates.length-1) return; 
        if(target==0){
            r.add(new ArrayList<>(ds));
            return; 
        }
        //pick 
        ds.add(candidates[ind]);
        check(ind, candidates, r, target-candidates[ind], ds);
        //not pick
        ds.remove(ds.size()-1);
        check(ind+1, candidates, r, target, ds);
    }
}