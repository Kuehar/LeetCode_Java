class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
// Runtime: 7 ms, faster than 21.43% of Java online submissions for Squares of a Sorted Array. O(NlogN)
// Memory Usage: 55.9 MB, less than 16.10% of Java online submissions for Squares of a Sorted Array.

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length,left=0,right=n-1;
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            int square;
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                square = nums[right];
                right--;
            }else{
                square = nums[left];
                left++;
            }
             ans[i] = square*square;
        }
        return ans;
    }
}
// Runtime: 2 ms, faster than 80.64% of Java online submissions for Squares of a Sorted Array.
// Memory Usage: 55.8 MB, less than 16.10% of Java online submissions for Squares of a Sorted Array.
