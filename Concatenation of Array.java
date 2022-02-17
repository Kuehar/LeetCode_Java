class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
// Runtime: 1 ms, faster than 81.64% of Java online submissions for Concatenation of Array.
// Memory Usage: 50.5 MB, less than 5.10% of Java online submissions for Concatenation of Array.
