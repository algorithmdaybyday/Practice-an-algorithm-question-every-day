
import java.util.Random;
class Solution {
    private int [] nums;
    private Random random;    
    
    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums == null) return null;
        int [] res = nums.clone();
        for(int j=0; j<res.length; j++){
            int i = random.nextInt(j + 1);
            swap(res, i, j);
        }
        return res;
    }
    
    private void swap (int [] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
