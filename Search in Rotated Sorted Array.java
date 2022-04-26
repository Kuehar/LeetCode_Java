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

class Solution {
  int [] nums;
  int target;

  public int find_rotate_index(int left, int right) {
    if (nums[left] < nums[right])
      return 0;

    while (left <= right) {
      int pivot = (left + right) / 2;
      if (nums[pivot] > nums[pivot + 1])
        return pivot + 1;
      else {
        if (nums[pivot] < nums[left])
          right = pivot - 1;
        else
          left = pivot + 1;
      }
    }
    return 0;
  }

  public int search(int left, int right) {
    /*
    Binary search
    */
    while (left <= right) {
      int pivot = (left + right) / 2;
      if (nums[pivot] == target)
        return pivot;
      else {
        if (target < nums[pivot])
          right = pivot - 1;
        else
          left = pivot + 1;
      }
    }
    return -1;
  }

  public int search(int[] nums, int target) {
    this.nums = nums;
    this.target = target;

    int n = nums.length;

    if (n == 1)
      return this.nums[0] == target ? 0 : -1;

    int rotate_index = find_rotate_index(0, n - 1);

    // if target is the smallest element
    if (nums[rotate_index] == target)
      return rotate_index;
    // if array is not rotated, search in the entire array
    if (rotate_index == 0)
      return search(0, n - 1);
    if (target < nums[0])
      // search in the right side
      return search(rotate_index, n - 1);
    // search in the left side
    return search(0, rotate_index);
  }
}
// Runtime: 1 ms, faster than 62.37% of Java online submissions for Search in Rotated Sorted Array.
// Memory Usage: 42.2 MB, less than 67.73% of Java online submissions for Search in Rotated Sorted Array.

