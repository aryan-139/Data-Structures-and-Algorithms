class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);
            for(int j=0; j< strs.length;j++){
                if(ch==strs[j].charAt(i))
                    continue;
                else
                    return(strs[0].substring(0,i));
            }
        }
        return(strs[0].substring(0));
           
    }
}