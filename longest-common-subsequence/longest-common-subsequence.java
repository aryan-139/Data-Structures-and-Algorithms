// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         //we can solve this using hashmap 
//         //declare a hashmap-> store characters of text1 to it -> compare the ones in text2-> problem solved 
//         HashMap<Character, Integer> map = new HashMap<>();
//         char charArr[]=text1.toCharArray();
//         char charArr2[]=text2.toCharArray();
//         for(int i=0;i<charArr.length;i++)
//         map.put(charArr[i],1);
//         int counter=0;
//         //compare the similar characters
//         for(int j=0;j<charArr2.length;j++){
//             if(map.containsKey(charArr2[j])){
//                 counter++;
//                 map.remove(charArr2[j]);
//             }
//         }
//         return(counter);
//     }
// }
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // Initialize the DP table with zeros
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        
        // Iterate over the strings
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                // If the characters at the current index are equal
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // Increment the length of the LCS by one
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // Otherwise, use the maximum LCS length found so far
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // Return the length of the longest common subsequence
        return dp[text1.length()][text2.length()];
    }
}
