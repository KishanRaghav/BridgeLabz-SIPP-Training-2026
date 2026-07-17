import java.util.*;

public class MostFrequentErrorCode {

    public static int mostFrequent(int[] codes) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        int answer = codes[0];
        int maxCount = 0;

        for (int code : codes) {

            int count = frequency.getOrDefault(code, 0) + 1;
            frequency.put(code, count);

            if (count > maxCount) {
                maxCount = count;
                answer = code;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] codes = new int[n];

        for (int i = 0; i < n; i++) {
            codes[i] = sc.nextInt();
        }

        System.out.println(mostFrequent(codes));

        sc.close();
    }
}