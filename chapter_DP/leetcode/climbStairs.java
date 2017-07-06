public class Solution {
    public int climbStairs(int n) {
        int res = 0;
        if(n == 0) return res;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int []stairs = new int[n+1];
        stairs[0] = 0;
        stairs[1] = 1;
        stairs[2] = 2;
        for(int i = 3; i <= n; i++){
            stairs[i] = stairs[i-2] + stairs[i-1];
        }
        return stairs[n];
    }
}
