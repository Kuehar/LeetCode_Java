class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            System.out.println(mid);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
// Runtime: 4 ms, faster than 7.00% of Java online submissions for Binary Search. Time complexity is O(logN).
// Memory Usage: 54.9 MB, less than 5.88% of Java online submissions for Binary Search.
