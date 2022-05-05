class Solution {
    public int rob(int[] nums) {
        // rob -> 現在のHouseに入った場合に得られるお金が最大になる場合の変数
        // notRob -> 現在のHouseに入らなかった場合に得られるお金が最大になる場合の変数
        // curRob -> 現在のHouseに入った場合に前の家から強奪していないことを管理する変数
        int rob = 0,notRob = 0;
        for(int i=0;i<nums.length;i++){
            int curRob = notRob + nums[i];
            notRob = Math.max(notRob,rob);
            rob = curRob;
        }
        return Math.max(rob,notRob);
    }
}
// Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
// Memory Usage: 41.4 MB, less than 58.63% of Java online submissions for House Robber.
