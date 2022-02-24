class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] < target){
                left = mid+1;
            }else if(nums[mid] == target){
                return mid;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search. Time complexity is O(logN)
// Memory Usage: 54.4 MB, less than 17.13% of Java online submissions for Binary Search.
