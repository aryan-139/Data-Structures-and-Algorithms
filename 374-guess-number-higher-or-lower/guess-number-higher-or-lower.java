public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int lo = 1;
        int high = n;
        
        while (lo <= high) {  // Changed from 'while (lo < high)'
            int currGuess = lo + (high - lo) / 2;  // To avoid integer overflow
            int currResponse = guess(currGuess);
            
            if (currResponse == 0) {
                return currGuess;
            } else if (currResponse < 0) {
                high = currGuess - 1;  // Adjusted high
            } else {
                lo = currGuess + 1;   // Adjusted lo
            }
        }
        
        return -1;  // No solution found
    }
}
