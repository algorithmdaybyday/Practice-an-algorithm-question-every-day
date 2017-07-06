public class Solution {
    public int trap(int[] A) {
        int left = 0, right = A.length - 1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;
        while (left <= right) {
            if(A[left] <= A[right]) {
                if(A[left] >= maxLeft) maxLeft = A[left];
                else res += maxLeft - A[left];
                left++;
            } else {
                if(A[right] >= maxRight) maxRight = A[right];
                else res += maxRight - A[right];
                right--;
            }
        }
        return res;
    }
}
