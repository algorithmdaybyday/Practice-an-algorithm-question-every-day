public class Solution {

    public int uniquePaths(int m, int n) {
        int[][] mat = new int[m+1][n+1];
        mat[m-1][n] = 1;
        for(int r=m-1; r>=0; r--){
            for(int c= n-1; c>=0; c--){
                mat[r][c] = mat[r+1][c] + mat[r][c+1];
            }
        }
        return mat[0][0];
    }
}
