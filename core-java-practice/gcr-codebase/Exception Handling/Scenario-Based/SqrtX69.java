public class SqrtX69 {

    public int mySqrt(int x) {

        long left = 0;
        long right = x;
        long answer = 0;

        while (left <= right) {

            long mid = left + (right - left) / 2;

            if (mid * mid <= x) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) answer;
    }
}