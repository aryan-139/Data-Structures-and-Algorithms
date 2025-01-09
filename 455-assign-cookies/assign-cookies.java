// public class Solution {
//     public int findContentChildren(int[] children, int[] cookies) {
//         Arrays.sort(children);
//         Arrays.sort(cookies);
        
//         int child = 0;
//         for (int cookie = 0; child < children.length && cookie < cookies.length; cookie ++) {
//             if (cookies[cookie] >= children[child]) {
//                 child ++;
//             }
//         }
        
//         return child;
//     }
// }

class Solution{
    public int findContentChildren(int []g, int []s){
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int i=0; int j=0; 
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                count++;
                i++; j++;
            } else {
                j++;
            }
        }
        return count;
    }
}