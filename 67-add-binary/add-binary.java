class Solution {
    public String addBinary(String a, String b) {
    int pa = a.length() - 1, pb = b.length() - 1;
    int carry = 0;
    StringBuilder builder = new StringBuilder();

    int na, nb;
    while (pa >= 0 || pb >= 0 || carry != 0) {
        na = pa >= 0 ? a.charAt(pa) - '0' : 0;
        nb = pb >= 0 ? b.charAt(pb) - '0' : 0;
        int sum = na ^ nb ^ carry; // add lowest to output
        builder.append(sum);
        carry = (na & nb) | (na & carry) | (nb & carry); // keeps highest as next carry
        pa--;
        pb--;
    }

    return builder.reverse().toString();
}

    }

