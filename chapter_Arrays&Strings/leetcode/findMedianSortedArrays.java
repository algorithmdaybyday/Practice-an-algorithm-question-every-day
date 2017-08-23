class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
	int n = nums2.length;
	
	if (m > n) {
		return findMedianSortedArrays(nums2, nums1);
	}
	
	int i = 0, j = 0, imin = 0, imax = m, half = (m + n + 1) / 2;
	double maxLeft = 0, minRight = 0;
	while(imin <= imax){
		i = (imin + imax) / 2;
		j = half - i;
		if(j > 0 && i < m && nums2[j - 1] > nums1[i]){
			imin = i + 1;
		}else if(i > 0 && j < n && nums1[i - 1] > nums2[j]){
			imax = i - 1;
		}else{
			if(i == 0){
				maxLeft = (double)nums2[j - 1];
			}else if(j == 0){
				maxLeft = (double)nums1[i - 1];
			}else{
				maxLeft = (double)Math.max(nums1[i - 1], nums2[j - 1]);
			}
			break;
		}
	}
	if((m + n) % 2 == 1){
		return maxLeft;
	}
	if(i == m){
		minRight = (double)nums2[j];
	}else if(j == n){
		minRight = (double)nums1[i];
	}else{
		minRight = (double)Math.min(nums1[i], nums2[j]);
	}
	
	return (double)(maxLeft + minRight) / 2;
    }
}
