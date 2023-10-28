package array;

public class buy_sell_stock {
    public static int stock(int price[]) {
        int max_profit = 0;
        int buy_price = Integer.MAX_VALUE;

        for (int i = 0; i < price.length; i++) {
            if (buy_price < price[i]) {
                int profit = price[i] - buy_price;
                max_profit = Math.max(max_profit, profit);
            } else {
                buy_price = price[i];
            }
        }
        return max_profit;
    }

    public static void main(String arg[]) {
        int price[] = { 7, 6, 4, 3, 12 };
        System.out.println(stock(price));
    }
}
