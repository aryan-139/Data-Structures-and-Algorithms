class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int pair[][]= new int[position.length][2];
        for(int i=0; i<position.length; i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));
        Stack<Double> time= new Stack<>();
        for(int [] p: pair){
            time.push((double)(target-p[0])/p[1]);
            if(time.size()>=2 && (time.peek()<=time.get(time.size()-2))){
                time.pop();
            }
            
        }
        System.out.print(time);
        return time.size();
    }
} 