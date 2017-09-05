
class Solution {
    public boolean exist(char[][] board, String word) {
        char [] w = word.toCharArray();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(exist(board, i, j, w, 0)) return true;
            }
        }
        return false;
    }
    
    private boolean exist(char[][] board, int y, int x, char[] word, int i){
        if(i==word.length) return true;
        if(y<0 || x<0 || y==board.length || x==board[0].length){
            return false;
        }
        if(board[y][x] != word[i]) return false;
        board[y][x] ^= 256;
        boolean exist = exist(board, y, x+1, word, i+1) || exist(board, y+1, x, word, i+1)
            || exist(board, y-1, x, word, i+1) || exist(board, y, x-1, word, i+1);
        board[y][x] ^= 256;
        return exist;
    }
}
