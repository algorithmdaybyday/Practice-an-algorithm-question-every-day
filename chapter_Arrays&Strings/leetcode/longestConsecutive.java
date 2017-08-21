class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n: nums){
            if(!hm.containsKey(n)){
                int left = (hm.containsKey(n-1)) ? hm.get(n-1) : 0;
                int right = (hm.containsKey(n+1)) ? hm.get(n+1) : 0;
                int sum = left + right + 1;
                res = Math.max(res, sum);
                hm.put(n, sum);
                
                hm.put(n-left, sum);
                hm.put(n+right, sum);

            }else{
                continue;
            }
        }
        return res;
    }
}
