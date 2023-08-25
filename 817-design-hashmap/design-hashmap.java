class MyHashMap {

    private static final int SIZE = 1000001;
    private int[] map;

    public MyHashMap() {
        map = new int[SIZE];
        Arrays.fill(map, -1); // Initialize all entries with -1 (no value)
    }
    
    public void put(int key, int value) {
        map[key] = value;
    }
    
    public int get(int key) {
        return map[key];
    }
    
    public void remove(int key) {
        map[key] = -1;
    }
}