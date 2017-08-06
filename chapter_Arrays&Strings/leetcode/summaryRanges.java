public List<String> summaryRanges (int[] nums) {
	List<String> summary = new ArrayList<>();
	for (int i=0, j=0; j<nums.length; ++j) {
		if (j + 1 < nums.length && nums[j + 1] == nums[j] + 1)
			continue;
		if (i == j)
			summary.add(nums[i] + "");
		else
			summary.add(nums[i] + "->" + nums[j]);
		i = j + 1;
	}
	return summary;
}
