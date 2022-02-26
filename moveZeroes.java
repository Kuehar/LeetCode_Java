class Solution {
    public void moveZeroes(int[] nums) {
        int pointer1 = 0,pointer2 = 0;
        
        while(pointer1 < nums.length){
            if(nums[pointer1] == 0){
                pointer1++;
                continue;
        }
        
        if(pointer1 != pointer2){
            nums[pointer2] = nums[pointer1];
            nums[pointer1] = 0;
        }
        pointer1++;
        pointer2++;
    }
}
}
// Runtime: 3 ms, faster than 40.14% of Java online submissions for Move Zeroes.
// Memory Usage: 54.6 MB, less than 26.47% of Java online submissions for Move Zeroes.
