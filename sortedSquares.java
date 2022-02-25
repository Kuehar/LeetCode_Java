class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
// Runtime: 7 ms, faster than 21.43% of Java online submissions for Squares of a Sorted Array. O(NlogN)
// Memory Usage: 55.9 MB, less than 16.10% of Java online submissions for Squares of a Sorted Array.
