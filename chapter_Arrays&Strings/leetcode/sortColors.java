
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length<2) return;
        int left = 0; int right = nums.length - 1;
        for(int i=left; i<=right;){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;      
                i++;
                left++;
            }else if(nums[i] == 2){
                System.out.print( right);
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;               
                right--;
            }else{
                i++;
            }
        }
    }

}
