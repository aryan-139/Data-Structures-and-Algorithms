import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int clone[] = Arrays.copyOf(candies, candies.length);
        Arrays.sort(clone);
        int largest = clone[candies.length - 1];
        //System.out.println(largest);
        for(int i=0;i<candies.length;i++){
             System.out.println(candies[i]+extraCandies);
            if((candies[i]+extraCandies)>=largest)
            {ans.add(true);
               }
            else
            ans.add(false);
        }
        return ans;

    }
}