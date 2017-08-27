class Solution {
    public int rob(int[] nums) {
        int ifRobPrevious = 0;
        int ifNotRobPrevious = 0;
        for(int i=0; i<nums.length; i++){
            int currentRobbed = ifNotRobPrevious + nums[i];
            int currentNotRobbed = Math.max(ifNotRobPrevious, ifRobPrevious);
            
            ifRobPrevious = currentRobbed;
            ifNotRobPrevious = currentNotRobbed;
        }
        return Math.max(ifRobPrevious, ifNotRobPrevious);
    }
}
