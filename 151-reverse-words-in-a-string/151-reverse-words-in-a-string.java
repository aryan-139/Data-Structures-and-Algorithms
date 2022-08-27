class Solution {
    public String reverseWords(String s) {
        s.trim();
        // Stack <String> s2= new Stack<String>();
        // s2.push(s.substring();
        // String revStr="";
        // while(str_arr.hasMoreTokens(){
        //     revStr+=s2.pop();
        // }
        // return(revStr);
        String arr[]=s.split(" ");
        System.out.print(Arrays.toString(arr));
        String newStr="";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].equals(" ")||(arr[i].equals("")))
            {  System.out.print("p"); continue;}
            else
                newStr+=arr[i]+" ";
        }
        return(newStr.trim());
    }
}