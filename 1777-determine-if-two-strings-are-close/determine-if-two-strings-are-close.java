import java.util.Arrays;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        int[] freq1 = new int[26]; // Array to store the frequency of characters in word1
        int[] freq2 = new int[26]; // Array to store the frequency of characters in word2

        // Count the frequency of characters in word1
        for (char ch : word1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        // Count the frequency of characters in word2
        for (char ch : word2.toCharArray()) {
            freq2[ch - 'a']++;
        }

        // Check if the set of characters is the same in both words
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        // Sort the frequency arrays and check if they are the same
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1, freq2);
    }
}
