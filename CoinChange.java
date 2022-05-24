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
