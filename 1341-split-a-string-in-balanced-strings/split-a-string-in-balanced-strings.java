class Solution {
    public int balancedStringSplit(String s) {
        int len=s.length();
        char ch='a';
        int bal=0;
        int left=0;
        int right=0;
        for(int i=0;i<len;i++){
         ch=s.charAt(i);
         if(ch=='R')
         left++;
        //  else{
        //      for(int j=i;j<i+left;j++){
        //          if(ch=='L')
        //          right++;
        //      }
        //      System.out.print(left);

        //      System.out.print(right);
        //      if(left==right){
        //           left=0;
        //      bal++;
        //      right=0;
        //      }
           
        //  }
        if(ch=='L')
        right++;
        if(left==right){
            bal++;
            left=0;
            right=0;
        }
        
        }
        return bal;        
    }
}

// RLRRLLRLRL
     
// ch=R
// left=1
// i=1
// j<2