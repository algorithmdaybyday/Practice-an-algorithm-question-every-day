public class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int [n];
        ugly[0] = 1;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        int index2 = 0, index3 = 0, index5 = 0;
        for(int i = 1; i<n; i++){
            int min = Math.min(Math.min(factor2, factor3), factor5);
            ugly[i] = min;
            if(min == factor2) factor2 = 2*ugly[++index2];
            if(min == factor3) factor3 = 3*ugly[++index3];
            if(min == factor5) factor5 = 5*ugly[++index5];
        }
        return ugly[n-1];
    }
}
