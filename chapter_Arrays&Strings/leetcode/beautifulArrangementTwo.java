class Solution {
    public int[] constructArray(int n, int k) {
        int res [] = new int [n];
        int left = 1, right = n;
        for(int i=0; i<n; i++){
            res[i] = k%2!=0 ? left++ : right--;
            if(k>1)
                k--;
        }
        return res;
    }
}
