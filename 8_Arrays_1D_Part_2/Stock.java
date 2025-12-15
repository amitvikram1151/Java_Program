public class Stock {
    public static void sellBuyStock(int price[]) {
        int buyingprice = Integer.MAX_VALUE; // should be minimum 
        int profit = 0;
        int totalprofit = 0;
        int maxprofit = 0;

        for(int i = 0; i < price.length; i++) {
            if(buyingprice < price[i]) { // profit aa raha hoga 
                profit = price[i] - buyingprice;
                totalprofit += profit;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyingprice = price[i];
            }
        }
        System.out.println("Max profit is : " + maxprofit );
        System.out.println("total profit is : " + totalprofit);
    }

    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        sellBuyStock(price);
    }
}
