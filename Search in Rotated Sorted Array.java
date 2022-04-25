class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
// Memory Usage: 42 MB, less than 81.02% of Java online submissions for Search in Rotated Sorted Array.
// time complexity is log(n)

class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid-1;
                }else{
                    left  = mid+1;
                }
            }else{
                if(nums[mid] < target && target <= nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1; 
                }
            }
        }
        return nums[left] == target ? left : -1;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
// Memory Usage: 42.2 MB, less than 72.34% of Java online submissions for Search in Rotated Sorted Array.
// time complexity is O(logn)
