class Solution {
    public int[][] imageSmoother(int[][] M) {
        int sum;
        int count;
        int m = M.length;
        int n = M[0].length;
        int [][] ret = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                count = 0;
                sum = 0;
                if(i-1 >= 0 && i-1 < m && j-1 >=0 && j-1 < n){
                    count += 1;
                    sum += M[i-1][j-1]; // cell0
                }
                if(i-1 >= 0 && i-1 < m){
                    count += 1;
                    sum += M[i-1][j]; // cell1
                }
                if(i-1 >= 0 && i-1 < m && j+1 >=0 && j+1 < n){
                    count += 1;
                    sum += M[i-1][j+1]; // cell2
                }
                if(j-1 >=0 && j-1 < n){
                    count += 1;
                    sum += M[i][j-1]; //cell3
                }
                if(j+1 >=0 && j+1 < n){
                    count += 1;
                    sum += M[i][j+1]; //cell4
                }
                if(i+1 >= 0 && i+1 < m && j-1 >=0 && j-1 < n){
                    count += 1;
                    sum += M[i+1][j-1]; //cell5
                }
                if(i+1 >= 0 && i+1 < m){
                    count += 1;
                    sum += M[i+1][j]; //cell6
                }
                if(i+1 >= 0 && i+1 < m && j+1 >=0 && j+1 < n){
                    count += 1;
                    sum += M[i+1][j+1];
                }
                sum += M[i][j]; //itself
                count+=1;
                ret[i][j] = sum / count;
            }
        }
        return ret;
    }
}
