
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        if ( nums == null || len < 4) return res;
        Arrays.sort(nums);
        
        if(4*nums[0] > target || 4*nums[len - 1] < target)
            return res;
        
        int z;
        for(int i=0; i<len-3; i++){
            z = nums[i];
            if(i>0 && z == nums[i-1]) continue;
            if(z + 3 * nums[len - 1] < target) continue;
            if(4 * z > target) continue;
            if(4 * z == target){
                if(i + 3 < len && nums[i+3] == z)
                    res.add(Arrays.asList(z, z, z, z));
                break;
            }
            threeSum(nums, target - z, i+1, len-1, res, z);
        }
        return res;
    }
    public void threeSum(int [] nums, int target, int low, int high, ArrayList<List<Integer>> fourSumList, int z1){
        if(low + 1 >= high)
            return;
        int max = nums[high];
        if(3*max < target || 3*nums[low] > target) return;
        int z;
        for(int i=low; i<high-1; i++){
            z = nums[i];
            if(i>low && z==nums[i-1]) continue;
            if(z + 2*max < target) continue;
            if(3*z > target) break;
            if(3*z == target){
                if(i+1 < high && nums[i + 2] == z)
                    fourSumList.add(Arrays.asList(z1, z, z, z));
                break;
            }
            
            twoSum(nums, target - z, i + 1, high, fourSumList, z1, z);
        }
    }
    
    public void twoSum(int [] nums, int target, int low, int high, ArrayList<List<Integer>> fourSumList, int z1, int z2){
    if(low >= high)
        return;
    if(2*nums[low] > target || 2*nums[high] < target) return;
    int sum, x, i, j;
        i = low;
        j = high;
    while(i < j){
        sum = nums[i] + nums[j];
        if(sum == target){
            fourSumList.add(Arrays.asList(z1, z2, nums[i], nums[j]));
            while(i < j && nums[i]== nums[i+1]) i++;
            while(i < j &&nums[j] == nums[j-1]) j--;
            i++;
            j--;
            
        }else if(sum > target){
            j--;
        }else{
            i++;
        }
    }
        return;
}
    
}
