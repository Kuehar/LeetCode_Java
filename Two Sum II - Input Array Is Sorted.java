class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
// Runtime: 407 ms, faster than 5.01% of Java online submissions for Two Sum II - Input Array Is Sorted.
// Memory Usage: 44.6 MB, less than 37.33% of Java online submissions for Two Sum II - Input Array Is Sorted.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left=0,right=n-1;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}
// Runtime: 2 ms, faster than 46.27% of Java online submissions for Two Sum II - Input Array Is Sorted.
// Memory Usage: 50.1 MB, less than 13.17% of Java online submissions for Two Sum II - Input Array Is Sorted.
