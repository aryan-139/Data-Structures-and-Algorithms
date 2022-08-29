// class Solution {
//     public String longestPalindrome(String s) {
//          String str=""; boolean check=false;
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 if(s.charAt(i)==s.charAt(j))
//                     check=checkpal(i,j,s);
//                 if((check==true)&&(s.substring(i,j).length()>str.length()))
//                 {
//                     System.out.println(s.substring(i,j));
//                     str=s.substring(i,j);
//                 }
//             }
//         }
//         return(str);
//     }
//     public boolean checkpal(int i, int j, String s){
//                     System.out.println(s.substring(i,j));
//         for(int p=i;p<=j/2;p++){
//             if(s.charAt(p)==s.charAt(j))
//                 continue;
//             else
//                 return(false);
//         }
//         return(true);
//     }
// }
class Solution {
    public String longestPalindrome(String s){
        if (s == null || s.trim().equals("")) {
            return s;
        }
        int len = s.length();
        int begin = 0;
        int maxLen = 0;
        for (int i = 0; i < len - maxLen / 2; i++) {
            int j = i;
            int k = i;
            while (k < len - 1 && s.charAt(k) == s.charAt(k + 1)) { // Skip duplicated characters to the right
                k++;
            }
            while (j > 0 && k < len - 1 && s.charAt(j-1) == s.charAt(k+1)) { // Expand both left and right
                j--;
                k++;
            }
            int newLen = k - j + 1;
            if (newLen > maxLen) {
                begin = j;
                maxLen = newLen;
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}