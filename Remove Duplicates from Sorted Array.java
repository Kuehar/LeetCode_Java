class Solution {
    public int removeDuplicates(int[] nums) {        
        if(nums.length==0) return 0;
        int targetIndex=1,currentNum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] != currentNum){
                currentNum = nums[i];
                nums[targetIndex] = nums[i];
                targetIndex++;
            }
        }
        return targetIndex;
    }
}
// Runtime: 1 ms, faster than 88.75% of Java online submissions for Remove Duplicates from Sorted Array.
// Memory Usage: 47.9 MB, less than 8.75% of Java online submissions for Remove Duplicates from Sorted Array.

class Solution{
public int removeDuplicates(int[] nums) {
		int length = nums.length;
		for(int i=length-2;i>=0;i--) {
			if(nums[i] == nums[i+1]) {
				for(int j=i+1;j<length;j++) {
					nums[j-1] = nums[j];
				}
				length--;
			}
		}
		return length;
	}
}
