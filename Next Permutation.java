class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i+1]<= nums[i]){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
        
    }
    private void reverse(int[] nums,int start){
        int i = start,j = nums.length - 1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Next Permutation.
// Memory Usage: 42.3 MB, less than 93.75% of Java online submissions for Next Permutation.
