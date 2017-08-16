public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n==0) return 0;
        int [] dp = new int [n+1];
        dp[0] = 1;
        dp[1] = (s.charAt(0) == '0') ? 0 : 1;
        for (int i=2; i<=n; i++) {
            int first = Integer.valueOf(s.substring(i-1, i));
            int second = Integer.valueOf(s.substring(i-2, i));
            if(first >= 1 && first <= 9){
                dp[i] = dp[i-1] + dp[i];
            }
            if(second >= 10 && second <= 26){
                dp[i] = dp[i-2] + dp[i];
            }
        }
        return dp[n];
    }
}
