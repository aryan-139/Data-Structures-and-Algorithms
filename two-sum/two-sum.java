import java.util.Scanner;
//finding twosum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    return(res);
                }
                else
                continue;
        }
        res[0]=0;
        res[1]=0;
        return(res);
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Solution obj=new Solution();
        int len=sc.nextInt();
        int nums[]=new int[len]; int target;
        for(int i=0;i<len;i++)
            nums[i]=sc.nextInt();
        System.out.println("Enter the number for the target array");
        target=sc.nextInt();
        int[] res=obj.twoSum(nums,target);
        
    }

}