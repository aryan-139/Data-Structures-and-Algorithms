class Solution {

    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) return (false);
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                c++;
                if (c == 3) return (true);
            } else {
                if (c == 3) return (true);
                c = 0;
            }
        }
        return (false);
    }
}
