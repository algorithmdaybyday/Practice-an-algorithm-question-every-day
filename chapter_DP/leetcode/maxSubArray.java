To devise a dynamic programming formula, let us assume that we are calculating the
maximum sum of subarray that ends at a specific index. Let us denote that:
f(k) = Maximum sum of subarray ending at index k. Then,
f(k) = max( f(k-1) + A[k], A[k] )
Using an array of size n, We could deduce the final answer by as f(n – 1), with the initial state of f(0) = A[0]. Since we only need to access its previous element at each step, two variables are sufficient. Notice the difference between the two: maxEndingHere and maxSoFar; the former is the maximum sum of subarray that must end at index k, while the latter is the global maximum subarray sum.
 
public int maxSubArray(int[] A) {
   int maxEndingHere = A[0], maxSoFar = A[0];
   for (int i = 1; i < A.length; i++) {
      maxEndingHere = Math.max(maxEndingHere + A[i], A[i]);
      maxSoFar = Math.max(maxEndingHere, maxSoFar);
   }
   return maxSoFar;
}
