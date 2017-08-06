public class Solution {
    public int maxProduct(int[] A) {
        assert A.length > 0;
        int max = A[0], min = A[0], maxAns = A[0];
        for (int i=1 ; i<A.length; i++) {
            if(A[i] < 0) {
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(A[i], max*A[i]);
            min = Math.min(A[i], min*A[i]);
            maxAns = Math.max(maxAns, max);
        }
        return maxAns;
    }
}
