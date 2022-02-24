class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;++i){
            if(set.contains(nums[i])){
                return true;
            }
            
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
// Runtime: 30 ms, faster than 70.57% of Java online submissions for Contains Duplicate II.
// Memory Usage: 77.8 MB, less than 66.39% of Java online submissions for Contains Duplicate II.
