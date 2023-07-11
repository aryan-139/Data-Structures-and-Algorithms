import java.util.HashSet;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // base case,
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int lengthForSubstring = gcd(str1.length(), str2.length());

        return (str1.substring(0, lengthForSubstring));
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else {
            return gcd(b, a % b);
        }
    }

}