class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        while(k > 0){
            // ローテーションのアルゴリズム
            int temp = nums[n-1];
            for(int i=n-2;i>=0;i--){
                nums[i+1] = nums[i];
            }
            nums[0] = temp;
            k--;
        }
    }
}
// Time Limit Exceeded.
