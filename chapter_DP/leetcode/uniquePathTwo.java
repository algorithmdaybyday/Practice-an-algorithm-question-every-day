public int uniquePathsWithObstacles(int[][] obstacleGrid) {
   int m = obstacleGrid.length;
   if (m == 0) return 0;
   int n = obstacleGrid[0].length;
   int[][] mat = new int[m + 1][n + 1];
   mat[m - 1][n] = 1;
   for (int r = m - 1; r >= 0; r--) {
      for (int c = n - 1; c >= 0; c--) {
         mat[r][c] = (obstacleGrid[r][c] == 1) ? 0 : mat[r][c+1] + mat[r+1][c];
} }
   return mat[0][0];
}

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] dp = new int [m][n];
        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for(int i = 1; i<m; i++){
            if(obstacleGrid[i][0] == 1){
                dp[i][0] = 0;
            }else{
                dp[i][0] = dp[i-1][0];
            }
        }
        for(int i = 1; i<n; i++){
            if(obstacleGrid[0][i] == 1){
              dp[0][i] = 0;

            }else{
             dp[0][i] = dp[0][i-1];
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
