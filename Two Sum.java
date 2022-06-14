class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
// Runtime: 133 ms, faster than 6.72% of Java online submissions for Two Sum.
// Memory Usage: 44.8 MB, less than 64.49% of Java online submissions for Two Sum.
