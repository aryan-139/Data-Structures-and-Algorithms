public class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((1 << i & n) != 0) {
                res++;
            }
        }
        return res;
    }
}