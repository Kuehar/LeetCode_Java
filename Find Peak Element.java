public class Solution {
    public int findPeakElement(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }
    public int search(int[] nums, int l, int r) {
        if (l == r)
            return l;
        int mid = (l + r) / 2;
        if (nums[mid] > nums[mid + 1])
            return search(nums, l, mid);
        return search(nums, mid + 1, r);
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
// Memory Usage: 41.5 MB, less than 94.72% of Java online submissions for Find Peak Element.

public class Solution {
    public int findPeakElement(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid] > nums[mid+1]){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
// Memory Usage: 43.3 MB, less than 19.23% of Java online submissions for Find Peak Element.
