class WordDictionary {
    public class TrieNode{
        public TrieNode [] children = new TrieNode[26];
        public boolean isWord;
    }
            
    
    private TrieNode root = new TrieNode();

    /** Initialize your data structure here. */
    public WordDictionary() {
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode ws = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(ws.children[c - 'a'] == null)
                ws.children[c - 'a'] = new TrieNode();
            ws = ws.children[c - 'a'];
        }
        ws.isWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return match(word.toCharArray(), 0, root);
    }
    
    public boolean match(char [] chars, int k, TrieNode node){
        if(k==chars.length) return node.isWord;
        if(chars[k] == '.'){
            for(int i=0; i<node.children.length; i++){
                if(node.children[i]!=null && match(chars, k+1, node.children[i]))
                    return true;
            }
        }else{
            return node.children[chars[k] - 'a'] != null && match(chars, k + 1, node.children[chars[k] - 'a']);

        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
