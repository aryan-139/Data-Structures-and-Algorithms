class Trie {
    private static class Node{
        Node [] children= new Node[26];
        boolean isWord;
    }
    private final Node root;

    public Trie() {
        root= new Node();
    }
    
    public void insert(String word) {
        Node curr= root; 
        for(int i=0; i<word.length(); i++){
            char c= word.charAt(i);
            int idx= c - 'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();
            }
            curr= curr.children[idx];
        }
        curr.isWord=true;
    }
    
    public boolean search(String word) {
        Node node= traverse(word);
        return node!=null && node.isWord;
    }
    
    public boolean startsWith(String prefix) {
        return traverse(prefix)!=null;
    }

    private Node traverse(String s){
        Node curr=root; 
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            int idx= c - 'a';
            if(curr.children[idx]==null){
                return null;
            }
            curr=curr.children[idx];
        }
        return curr;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */