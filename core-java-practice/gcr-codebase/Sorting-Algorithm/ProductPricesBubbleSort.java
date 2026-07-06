import java.util.Scanner;

public class ProductPricesBubbleSort {

    public static void bubbleSort(long[] prices) {
        int n = prices.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (prices[j] > prices[j + 1]) {
                    long temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] prices = new long[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextLong();
        }

        bubbleSort(prices);

        for (long price : prices) {
            System.out.print(price + " ");
        }
    }
}