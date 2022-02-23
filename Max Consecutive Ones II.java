class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0,left = 0,right = 0,countZeros = 0;
        while(right<nums.length){
            if(nums[right]==0){
                countZeros++;
            }
            while(countZeros == 2){
                if(nums[left] == 0){
                    countZeros--;
                }
                left++;
            }
            
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
// Runtime: 3 ms, faster than 69.76% of Java online submissions for Max Consecutive Ones II.
// Memory Usage: 57.3 MB, less than 11.71% of Java online submissions for Max Consecutive Ones II.
