class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> tempList){
        if(tempList.size() == nums.length){
            ans.add(new ArrayList<>(tempList));
        } else {
            for(int i=0; i<nums.length; i++){
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(nums, ans, tempList);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
