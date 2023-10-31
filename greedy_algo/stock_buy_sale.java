package greedy_algo;

public class stock_buy_sale {
    public static int maxprof(int price[]) {
        int maxright[] = new int[price.length];
        maxright[price.length - 1] = price[price.length - 1];
        for (int i = price.length - 2; i >= 0; i--) { // Corrected loop condition
            if (maxright[i + 1] < price[i]) {
                maxright[i] = price[i];
            } else {
                maxright[i] = maxright[i + 1];
            }
        }
        int max = 0;
        for (int i = 0; i < price.length; i++) {
            if (max < (maxright[i] - price[i])) {
                max = maxright[i] - price[i];
            }
        }

        return max;
    }

    public static void main(String arg[]) {
        int prices[] = {7, 6, 4, 3, 1};
        System.out.println(maxprof(prices));
    }
}
