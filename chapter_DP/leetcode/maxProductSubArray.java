public class Solution {
    public int maxProduct(int[] A) {
        assert A.length > 0;
        int max = A[0], min = A[0], maxAns = A[0];
        for(int i=1; i<A.length; i++){
            int mx = max, mn = min;
            max = Math.max(Math.max(A[i], mx * A[i]), mn*A[i]);
            min = Math.min(Math.min(A[i], mx * A[i]), mn*A[i]);
            maxAns = Math.max(max, maxAns);
        }
        return maxAns;
    }
}
