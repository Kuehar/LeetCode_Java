class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1 && nums[0] == 0){
            return 0;
        }
        
        int count=0,consectiveCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                consectiveCount++;
            }else{
                count = Math.max(count,consectiveCount);
                consectiveCount = 0;
            }
        }
        return Math.max(count,consectiveCount);
    }
}
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Max Consecutive Ones.
// Memory Usage: 56.7 MB, less than 9.18% of Java online submissions for Max Consecutive Ones.
