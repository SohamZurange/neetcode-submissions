class Solution {
    public int maxProfit(int[] prices) {
        int min = 0;
        int max = prices.length - 1;
        int profit = 0;
        int currentMax = max;

        while(min < max){
            if(min >= currentMax){
                min++;
                currentMax = max;
            }
            else if(prices[min] < prices[currentMax]){
                profit = Math.max(profit, prices[currentMax] - prices[min]);
                currentMax--;
            }
            else{
                currentMax--;
            }

        }
        return profit;
    }
}
