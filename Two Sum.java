class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
// Runtime: 133 ms, faster than 6.72% of Java online submissions for Two Sum. O(N^2)
// Memory Usage: 44.8 MB, less than 64.49% of Java online submissions for Two Sum.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
// Runtime: 2 ms, faster than 91.18% of Java online submissions for Two Sum. O(N)
// Memory Usage: 42.1 MB, less than 96.20% of Java online submissions for Two Sum.
