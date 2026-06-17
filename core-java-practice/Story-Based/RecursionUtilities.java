public class RecursionUtilities {

    static int moveCount = 0;

    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }
        return binarySearch(arr, mid + 1, right, target);
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    private static boolean checkBalance(String str, int index, int count) {
        if (count < 0) {
            return false;
        }
        if (index == str.length()) {
            return count == 0;
        }
        char ch = str.charAt(index);

        if (ch == '(') {
            return checkBalance(str, index + 1, count + 1);
        }
        if (ch == ')') {
            return checkBalance(str, index + 1, count - 1);
        }
        return checkBalance(str, index + 1, count);
    }

    public static void main(String[] args) {
        int disks = 3;
        System.out.println("Tower of Hanoi Solution:");
        towerOfHanoi(disks, 'A', 'B', 'C');
        System.out.println("Total Moves: " + moveCount);

        int[] prices = {100, 200, 300, 400, 500, 600};
        int target = 400;

        System.out.println("\nBinary Search Index: " + binarySearch(prices, 0, prices.length - 1, target));
        System.out.println("Sum of Digits (12345): " + sumOfDigits(12345));
        System.out.println("Reverse of 'Temple': " + reverseString("Temple"));
        System.out.println("Balanced Parentheses '(()())': " + isBalanced("(()())"));
        System.out.println("Balanced Parentheses '(()': " + isBalanced("(()"));
    }
}