class Solution {
    public int coinChange(int[] coins, int amount) {
        return coinChange(0,coins,amount);
    }
    
    private int coinChange(int idxCoin,int[] coins,int amount){
        if(amount == 0)
            return 0;
        if(idxCoin < coins.length && amount > 0){
            int maxVal = amount / coins[idxCoin];
            int minCost = Integer.MAX_VALUE;
                for(int i=0;i<=maxVal;i++){
                    if(amount>=i*coins[idxCoin]){
                        int res = coinChange(idxCoin+1,coins,amount-i*coins[idxCoin]);
                        if(res != -1){
                            minCost = Math.min(minCost,res+i);
                        }
                    }
                }
            return (minCost == Integer.MAX_VALUE) ? -1:minCost;
        }
        return -1;
    }
}
// Time Limit Exceeded. the worst case is O(S^N)

public class Solution {
  public int coinChange(int[] coins, int amount) {
    int max = amount + 1;
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, max);
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
      for (int j = 0; j < coins.length; j++) {
        if (coins[j] <= i) {
          dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
        }
      }
    }
    return dp[amount] > amount ? -1 : dp[amount];
  }
}

class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1) return 0;
        return coinChange(coins,amount,new int[amount]);
    }
    
    public int coinChange(int[] coins,int rem,int[] count){
        if(rem<0) return -1;
        if(rem==0) return 0;
        if(count[rem-1] != 0) return count[rem-1];
        int min = Integer.MAX_VALUE;
        for(int coin:coins){
            int res = coinChange(coins,rem-coin,count);
            if(res>=0 && res<min){
                min = 1+res;
            }            
        }
        count[rem-1] = (min == Integer.MAX_VALUE) ? -1:min;
        return count[rem-1];
    }
}
// Runtime: 68 ms, faster than 14.96% of Java online submissions for Coin Change.
// Memory Usage: 45 MB, less than 53.18% of Java online submissions for Coin Change.
