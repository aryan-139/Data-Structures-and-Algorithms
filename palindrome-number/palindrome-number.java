class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        if (s.length() == 1)
            return true;
        else
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                    return false;
            }
        return true;
    }
}