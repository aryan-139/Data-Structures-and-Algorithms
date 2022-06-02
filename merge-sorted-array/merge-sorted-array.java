class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=0, temp=0;
        for(int i=m;i<m+n;i++)
            nums1[i]=nums2[p++];
        //sort the nums1 array
        for(int j=0;j<m+n-1;j++)
        {
            for(int k=j+1;k<m+n;k++)
            {
                if(nums1[k]<nums1[j])
                {
                    temp=nums1[j];
                    nums1[j]=nums1[k];
                    nums1[k]=temp;
                }
            }
        }
        
    }
}