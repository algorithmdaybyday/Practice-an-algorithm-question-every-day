
class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int i;
        for( i=0; i<nums.length; i++){
            xor = xor ^ i ^ nums[i];
        }
        
        return xor ^ i;
    }
}

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]>mid) right = mid-1;
            else left = mid+1;
        }
        return left;
    }
