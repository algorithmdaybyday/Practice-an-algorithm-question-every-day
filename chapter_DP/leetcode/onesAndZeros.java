class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int [][] dp = new int [m+1][n+1];
        for(String str : strs){
            int [] count = getCounts(str);
            for(int i=m; i>=count[0]; i--){
                for(int j=n; j>=count[1]; j--){
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i-count[0]][j-count[1]]);
                }
            }
        }
        return dp[m][n];
    }
    
    public int [] getCounts(String str){
        int [] count = new int[2];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i) - '0']++;
        }
        return count;
    }
}
