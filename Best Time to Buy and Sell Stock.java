class Solution {
    public int maxProfit(int[] prices) {
        double minPrice = Double.MAX_VALUE,maxProfit = 0;
        for(Integer price: prices){
            maxProfit = Math.max(maxProfit,price-minPrice);
            minPrice = Math.min(minPrice,price);
        }
        int ans = (int) Math.round(maxProfit);
        return ans;
    }
}
// Runtime: 15 ms, faster than 5.24% of Java online submissions for Best Time to Buy and Sell Stock.
// Memory Usage: 90.4 MB, less than 37.45% of Java online submissions for Best Time to Buy and Sell Stock.
