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
