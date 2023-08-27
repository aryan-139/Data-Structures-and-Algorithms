class Solution {
    public int majorityElement(int[] nums) {
        //Method 1
    //    HashMap<Integer, Integer> map=new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    //     }
    //     int max=0,val=0;
    //     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    //         if(entry.getValue()>max){
    //             max=entry.getValue();
    //             val=entry.getKey();
    //         }
            
    //     }
    //     return val;
    
    
    
    //Method 2 

    // Arrays.sort(nums);
    // int max=0,c=0;
    // int curr=nums[0];
    // for(int i=0;i<nums.length;i++){
    //     if(nums[i]==curr){
    //         c++;
    //     } else{
    //         if(c>nums.length/2)
    //         return curr;
    //         if(c>max)
    //         max=c;
    //         curr=nums[i];
    //         c=1;
    //     }
    // }
    //  if (c > nums.length / 2) {
    //         return curr;  // Check for the last element
    //     }
    // return -1;

    //Method 3
    Arrays.sort(nums);
    return(nums[nums.length/2]);


    }
}