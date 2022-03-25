public class MaxProfit {

    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length == 0){
            return profit;
        }
        int buyPrice = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > buyPrice){
                if(profit < prices[i] - buyPrice){
                    profit = prices[i] - buyPrice;
                }
            }
            else {
                buyPrice = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
//        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {7, 6, 4, 3, 1};
//        int[] prices = {1, 2};
//        int[] prices = {2, 1};
        int[] prices = {1, 2, 4};
        System.out.println(mp.maxProfit(prices));;
    }
}
