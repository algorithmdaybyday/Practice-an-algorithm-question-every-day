public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[nums.length - 1] * nums[0] * nums[1];
        return a > b ? a : b;
    }
}
