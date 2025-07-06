class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map= new HashMap<>();
        int bulls=0; int cows=0; 
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        //count cows 
        for (int i = 0; i < guess.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            // If not a bull, check if it's a cow
            if (s != g && map.containsKey(g) && map.get(g) > 0) {
                cows++;
                map.put(g, map.get(g) - 1);
            }
        }

        return bulls+"A"+cows+"B";
    }
}