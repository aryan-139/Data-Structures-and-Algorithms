class Solution {
    public int majorityElement(int[] nums) {
        int ve=nums[0];
        int c=1; 
        //moore's voting algorithm O(n)
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]==ve){
                c++;
                System.out.println(i+" "+ve+" "+c);
            }
            else {
                --c;
                System.out.println(i+" "+ve+" "+c);
            }

            if(c==0){
                System.out.println(i+" "+ve);
                ve=nums[i+1];
            }

        }
        System.out.print(ve);
        return ve;
        //O(n) to determine which one has > n/2




    }
}