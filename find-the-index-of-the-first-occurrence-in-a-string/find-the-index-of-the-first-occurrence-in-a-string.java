class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // Empty needle is always present in haystack at index 0
        }

        int haystackLen = haystack.length();
        int needleLen = needle.length();

        if (haystackLen < needleLen) {
            return -1; // Needle is longer than haystack, not possible to find
        }

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            int j = 0; // Slow pointer

            // Move the fast and slow pointers while characters match
            while (j < needleLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If the entire needle was found, return the starting index
            if (j == needleLen) {
                return i;
            }
        }

        return -1; // Needle not found in haystack
    }
}
