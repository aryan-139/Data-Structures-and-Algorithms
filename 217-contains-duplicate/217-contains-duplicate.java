// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         //double pointer approach
//         int b=0, l=nums.length-1;
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++)
//         {
//             if(nums[b]==nums[b+1])
//                 return(true);
//             else
//                 b++;
//             if(nums[l]==nums[l-1])
//                 return(true);
//             else
//                 l--;
//             if(l==b)
//                 break;
//         }
//         return(false);
//     }
// }
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //neighbouring element approach
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return(true);
            else
                continue;
        }
        return(false);
    }
}