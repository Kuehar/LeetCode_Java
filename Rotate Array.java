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

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] tempNums = new int[n];
        for(int i=0;i<n;i++){
            //  [1,2,3,4,5,6,7],k=3の場合、[(i+k) % n]は3,4,5,6,0,1,2になる
            tempNums[(i+k) % n] = nums[i];
            System.out.println((i+k) % n);
        }
        for(int i=0;i<n;i++){
            nums[i] = tempNums[i];
        }
    }
}
// Runtime: 1 ms, faster than 82.75% of Java online submissions for Rotate Array.
// Memory Usage: 57.6 MB, less than 87.66% of Java online submissions for Rotate Array.
