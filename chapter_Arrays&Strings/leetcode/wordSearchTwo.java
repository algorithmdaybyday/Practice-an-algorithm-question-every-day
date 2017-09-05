
class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for(int y=0; y<board.length; y++){
            for(int x=0; x<board[0].length; x++){
                dfs(board, y, x, root, res);
            }
        }
        return res;
    }
    
    public void dfs(char[][] board, int y, int x, TrieNode p, List<String> res){
        char c = board[y][x];
        if(c=='#' || p.next[c - 'a'] == null) return;
        p = p.next[c - 'a'];
        if(p.word != null){
            res.add(p.word);
            p.word = null;
        }
        
        board[y][x] = '#';
        if(y>0) dfs(board, y-1, x, p, res);
        if(x>0) dfs(board, y, x-1, p, res);
        if(y<board.length - 1) dfs(board, y+1, x, p, res);
        if(x<board[0].length - 1) dfs(board, y, x+1, p, res);
        board[y][x] = c;
    }
    
    public TrieNode buildTrie (String [] words){
        TrieNode root = new TrieNode();
        for(String word: words){
            TrieNode p = root;
            for(char c : word.toCharArray()){
                int i = c - 'a';
                if(p.next[i] == null) p.next[i] = new TrieNode();
                p = p.next[i];
            }
            p.word = word;
        }
        return root;
    }
    
    class TrieNode {
        TrieNode [] next = new TrieNode [26];
        String word;
    }
}
