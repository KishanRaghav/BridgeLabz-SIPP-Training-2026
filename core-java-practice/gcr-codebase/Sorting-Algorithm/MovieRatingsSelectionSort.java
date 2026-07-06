import java.util.Scanner;

public class MovieRatingsSelectionSort {

    public static void selectionSort(int[] ratings) {
        int n = ratings.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (ratings[j] < ratings[min]) {
                    min = j;
                }
            }

            int temp = ratings[i];
            ratings[i] = ratings[min];
            ratings[min] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ratings = new int[n];

        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }

        selectionSort(ratings);

        for (int rating : ratings) {
            System.out.print(rating + " ");
        }
    }
}