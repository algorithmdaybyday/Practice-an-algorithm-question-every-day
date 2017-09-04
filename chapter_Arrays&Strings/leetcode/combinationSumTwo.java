
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans, new ArrayList<>(), 0, target, candidates);
        return ans;
    }
    
    public void backtrack(List<List<Integer>> ans, List<Integer> tempList, int curr, int target, int [] candidates){
        if(target < 0) return;
        if(target == 0){
            ans.add(new ArrayList<Integer>(tempList));
        }else{
            for(int i=curr; i<candidates.length; i++){
                if (i > curr && candidates[i] == candidates[i-1]) continue;
                tempList.add(candidates[i]);
                backtrack(ans, tempList, i + 1, target - candidates[i], candidates);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
