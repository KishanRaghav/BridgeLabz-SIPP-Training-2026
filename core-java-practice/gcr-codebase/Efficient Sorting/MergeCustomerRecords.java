import java.util.Scanner;

public class MergeCustomerRecords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] first = new int[n1];

        for (int i = 0; i < n1; i++) {
            first[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] second = new int[n2];

        for (int i = 0; i < n2; i++) {
            second[i] = sc.nextInt();
        }

        int[] result = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {

            if (first[i] <= second[j]) {
                result[k++] = first[i++];
            } else {
                result[k++] = second[j++];
            }
        }

        while (i < n1) {
            result[k++] = first[i++];
        }

        while (j < n2) {
            result[k++] = second[j++];
        }

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}