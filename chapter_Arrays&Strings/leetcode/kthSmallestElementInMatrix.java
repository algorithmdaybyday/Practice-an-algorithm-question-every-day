
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Tuple> pq = new PriorityQueue<>();
        for(int j=0; j<n; j++) pq.offer(new Tuple(0, j, matrix[0][j]));
        for(int i=0; i<k-1; i++){
            Tuple t = pq.poll();
            if(t.x == n-1) continue;
            pq.offer(new Tuple(t.x + 1, t.y, matrix[t.x + 1][t.y]));
        }
        return pq.poll().val;
    }
    
    class Tuple implements Comparable<Tuple> {
        int x, y, val;
        public Tuple (int x, int y, int val) {
            this.x = x;
            this.y = y; 
            this.val = val;
        }
        
        @Override
        public int compareTo(Tuple that){
            return this.val - that.val;
        }
    }
}


class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];
        
        while(left < right){
            int mid = left + (right - left) / 2;
            int count = 0, j= n-1;
            for(int i=0; i<n; i++){
                while(j>=0 && matrix[i][j] > mid) j--;
                count += (j + 1);
            }
            if(count < k) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
