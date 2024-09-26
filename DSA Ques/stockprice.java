public class stockprice {
    public static int stocksprice(int prices[]) {
        
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0; // Initialize maxprofit to 0

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < buyprice) {
                buyprice = prices[i];
            } else {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }

    public static void main(String args[]) {
        int prices[] = {7, 6, 4, 3, 1, 5,6};
        System.out.println("profit : " + stocksprice(prices));
    }
}
