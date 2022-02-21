class Solution{
  public int[] copyWithRemoveDuplicates(int[] nums) {
		if(nums == null || nums.length == 0) {
			return nums;
		}
		
		int uniqueNumbers = 0;
		for(int i=0;i<nums.length;i++) {
			if(i == 0 || nums[i] != nums[i-1]) {
			uniqueNumbers++;
			}
		}
		int[] result = new int[uniqueNumbers];
		int positionInResult = 0;
		for(int i=0;i<nums.length;i++) {
			if(i == 0 || nums[i] != nums[i-1]) {
				result[positionInResult] = nums[i];
				positionInResult++;
			}
		}
		return result;
	}
}
