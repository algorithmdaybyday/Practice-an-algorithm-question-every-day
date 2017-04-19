public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[]result = new int [2];
		int diff = 0;
		HashMap<Integer, Integer>m = new HashMap<>();
		for(int i = 0; i<nums.length; i++){
			result[0] = i;
			diff = target - nums[i];
			if(m.get(diff)!=null){
				result[1] = m.get(diff);
		break;
			}else{
				m.put(nums[i],i);
				result[0]=0;
				result[1]=0;
			}
		}
		
		v 
		return result;
	}
}
