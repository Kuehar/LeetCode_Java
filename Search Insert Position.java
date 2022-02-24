class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1,mid = left+(right-left)/2;
        while(left<=right){
            mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid] > target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
// Memory Usage: 43.5 MB, less than 18.93% of Java online submissions for Search Insert Position.
