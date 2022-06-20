class Solution {
    public void moveZeroes(int[] nums) {
//         int curr=0,l=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0)
//             {
//                 l++;
//                 for(int j=i;j<nums.length-l;j++){
//                     curr=nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=nums[j];
//                 }
                
//             }
//         }
//         int m=1;
//         while(m!=l+1){
//             nums[nums.length-m]=0;
//             m++;
//         }
        
        int copy[]=new int[nums.length]; int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            {copy[p]=nums[i]; p++;}
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=copy[i];
        }
    }
}