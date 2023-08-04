class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int right = k;
        int count = 0;
        int maxCount = 0;
        String s1 = s.toLowerCase();
        char[] ch = s1.toCharArray();

        // Count vowels in the initial window of size k
        for (int i = left; i < right; i++) {
            if (isVowel(ch[i])) {
                count++;
            }
        }
        maxCount = count; // Initialize maxCount with the initial count

        // Move the sliding window to the right and update count and maxCount accordingly
        while (right < ch.length) {
            if (isVowel(ch[left])) {
                count--;
            }
            if (isVowel(ch[right])) {
                count++;
            }
            maxCount = Math.max(maxCount, count);

            left++;
            right++;
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
