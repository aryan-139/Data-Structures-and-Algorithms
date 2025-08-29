class WordDictionary {
    private static class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean isWord;
    }

    private final Node root;

    public WordDictionary() {
        root = new Node();
    }

    // Add a word into the Trie
    public void addWord(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
            curr.children.putIfAbsent(ch, new Node());
            curr = curr.children.get(ch);
        }
        curr.isWord = true;
    }

    // Search a word with support for '.' wildcard
    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    // helper: DFS to handle '.' wildcard
    private boolean dfs(String word, int i, Node node) {
        if (i == word.length()) {
            return node.isWord;
        }

        char ch = word.charAt(i);

        if (ch == '.') {
            // '.' can match any letter → try all children
            for (Node child : node.children.values()) {
                if (dfs(word, i + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            Node next = node.children.get(ch);
            if (next == null) return false;
            return dfs(word, i + 1, next);
        }
    }
}
