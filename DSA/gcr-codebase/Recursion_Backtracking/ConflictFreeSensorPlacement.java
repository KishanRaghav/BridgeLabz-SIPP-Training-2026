import java.util.ArrayList;
import java.util.List;

public class ConflictFreeSensorPlacement {

    public static List<List<String>> placeSensors(int n) {

        List<List<String>> result = new ArrayList<>();

        int[] sensorCol = new int[n];

        backtrack(n, 0, sensorCol, result);

        return result;
    }

    private static void backtrack(int n,
                                  int row,
                                  int[] sensorCol,
                                  List<List<String>> result) {

        if (row == n) {
            result.add(buildBoard(n, sensorCol));
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, sensorCol)) {

                sensorCol[row] = col;

                backtrack(n, row + 1, sensorCol, result);
            }
        }
    }

    private static boolean isSafe(int row, int col, int[] sensorCol) {

        for (int i = 0; i < row; i++) {

            if (sensorCol[i] == col) {
                return false;
            }

            if (Math.abs(sensorCol[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }

        return true;
    }

    private static List<String> buildBoard(int n, int[] sensorCol) {

        List<String> board = new ArrayList<>();

        for (int row = 0; row < n; row++) {

            StringBuilder currentRow = new StringBuilder();

            for (int col = 0; col < n; col++) {

                if (sensorCol[row] == col) {
                    currentRow.append("Q");
                } else {
                    currentRow.append(".");
                }
            }

            board.add(currentRow.toString());
        }

        return board;
    }

    public static void main(String[] args) {

        int n = 4;

        List<List<String>> answer = placeSensors(n);

        for (List<String> board : answer) {

            for (String row : board) {
                System.out.println(row);
            }

            System.out.println();
        }
    }
}