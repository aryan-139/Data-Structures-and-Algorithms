class Solution {
    public boolean increasingTriplet(int[] nums) {
        //we are declaring the left and right variables with the largest possible mathematical value using the Java.lang library and Integer.MAX_VALUE
        int left=Integer.MAX_VALUE;
        int right= Integer.MAX_VALUE;
        //now we are traversing the array to find the first minimum value which is after certain iterations will be found and stored in left
        //now the second smallest value will be stored in right as if a value is greater than left then it will be compared with right
        //now by default, if we now have both the minimum and the second minimum value, we can now say that if a value is not less than left or is not smaller than the right limit then it must be greater than right meaning
        //left< right < current_value
        for(int n:nums){
            if(n<=left)
                left=n;
            else if(n<=right)
                right=n;
            else
                return(true);
        }
        return(false);
    }
}

//think flow, first think of longest increasing subsequence and if it exists and as sson as the length is equal to 3, terminate, this is a working solution to this 