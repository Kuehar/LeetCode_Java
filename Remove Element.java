class Solution {
    public int removeElement(int[] nums, int val) {
        int count =  0;
        for(int i=0;i<nums.length;i++){
             if(nums[i] != val){
                 nums[count] = nums[i];
                 count++;
             }
        }
        return count;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
// Memory Usage: 42.1 MB, less than 23.91% of Java online submissions for Remove Element.
