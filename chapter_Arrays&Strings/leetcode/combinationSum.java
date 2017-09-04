
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (candidates.length ==0 || candidates == null) return ans;
        backtrack(candidates, ans, new ArrayList<>(), target, 0);
        return ans;
    }
    
    public void backtrack(int[] candidates, List<List<Integer>> ans, List<Integer> tempList, int remain, int start){
        if (remain < 0) return;
        if (remain == 0) {
           ans.add(new ArrayList<Integer>(tempList));
        } else {
            for(int i=start; i<candidates.length; i++){
                tempList.add(candidates[i]);
                backtrack(candidates, ans, tempList, remain - candidates[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
