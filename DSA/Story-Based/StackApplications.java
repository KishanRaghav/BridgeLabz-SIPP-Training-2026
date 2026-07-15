import java.util.Stack;

public class StackApplications {

    static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    static int[] nextGreaterPrice(int[] prices) {

        int n = prices.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(prices[i]);
        }

        return result;
    }

    static int[] stockSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        return span;
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String expression = "{[()]}";

        if (isBalanced(expression)) {
            System.out.println("Balanced Brackets");
        } else {
            System.out.println("Not Balanced");
        }

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Next Greater Price:");
        printArray(nextGreaterPrice(prices));

        System.out.println("Stock Span:");
        printArray(stockSpan(prices));
    }
}