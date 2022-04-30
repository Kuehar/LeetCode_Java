class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int left=0,right=nums.length-1;
        if(nums[right]>nums[0]){
            return nums[0];
        }
        
        while(left<=right){
            int mid = left+(right-left)/2;
            
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            
            if(nums[mid-1] > nums[mid]){
                return nums[mid];
            }
            
            if(nums[mid] > nums[0]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
// Memory Usage: 41.8 MB, less than 91.33% of Java online submissions for Find Minimum in Rotated Sorted Array.
