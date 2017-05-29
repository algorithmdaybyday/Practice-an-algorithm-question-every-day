//what if the input is already sorted in ascending order?

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length;i++){
            int j = bSearch(numbers, target-numbers[i], i+1);
            if(j!=-1){
                return new int[]{i+1,j+1};
            }
        }
    throw new IllegalArgumentException("No two sum solution");
    }
    
    public int bSearch(int[]nums, int key, int start){
        int L = start, R = nums.length-1;
        while(L<R){
            int M = L+(R-L)/2;
            if(nums[M]<key){
                L = M+1;
            }else{
                R = M;
            }
        }
        return (L == R && nums[L] == key) ? L : -1;
    }
}
