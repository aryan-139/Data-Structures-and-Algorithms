class Solution {
    public int possibleStringCount(String word) {
        int count = 1; // original string is always valid
        int i = 0;

        while (i < word.length()) {
            int j = i;
            while (j < word.length() && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int len = j - i; // length of current group
            if (len > 1) {
                count += (len - 1); // how many smaller variants for this group
            }
            i = j;
        }

        return count;
    }
}