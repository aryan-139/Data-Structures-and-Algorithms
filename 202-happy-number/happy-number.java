class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<>();
        set.add(n);
        int sum=0; int n1=0;
        if(n==1) return true;
        while(sum!=1){
            n1=n;
            sum=0;
            while(n1>0){
                int d= (n1%10) * (n1%10);
                sum+=d;
                n1/=10;
            }
            System.out.println(sum);
            if(set.contains(sum)) return false;
            set.add(sum);
            n=sum;
        }
        return true; 
    }
}