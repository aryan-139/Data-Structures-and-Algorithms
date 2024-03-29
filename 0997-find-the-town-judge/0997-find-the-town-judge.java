import java.util.HashSet;

class Solution {
    public int findJudge(int n, int[][] trust) {
        //we can infer that these are directed graphs 
        //no dir'n from the sus node
        HashSet<Integer> set=new HashSet<>();
        int[] trustCount = new int[n+1];
        for(int i=0;i<trust.length;i++){
            trustCount[trust[i][0]]--;
            trustCount[trust[i][1]]++;
        }
        for(int i =1; i<=n;i++){
            if(trustCount[i]==n-1)return i;
        }
        return -1;
    }
}
