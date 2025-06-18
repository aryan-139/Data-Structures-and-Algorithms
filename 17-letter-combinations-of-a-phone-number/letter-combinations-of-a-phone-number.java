import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.length() == 0) return result;

        // Step 1: Create digit-to-letter mapping
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        // Step 2: Start backtracking from index 0
        backtrack(result, new StringBuilder(), digits, 0, map);
        return result;
    }

    // Recursive backtracking function
    private void backtrack(List<String> result, StringBuilder path, String digits, int index, Map<Character, String> map) {
        // Base case: if we've formed a combination of required length
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        // Get the letters that the current digit maps to
        String possibleLetters = map.get(digits.charAt(index));

        // Explore all letter options
        for (char letter : possibleLetters.toCharArray()) {
            path.append(letter); // Choose
            backtrack(result, path, digits, index + 1, map); // Explore
            path.deleteCharAt(path.length() - 1); // Un-choose (Backtrack)
        }
    }
}
