import java.util.Scanner;

public class EmployeeAttendanceRanking {

    public static void rankEmployees(int[] ids, int[] attendance, int k) {
        int n = ids.length;

        for (int i = 0; i < n - 1; i++) {
            int best = i;

            for (int j = i + 1; j < n; j++) {
                if (attendance[j] > attendance[best] ||
                        (attendance[j] == attendance[best] && ids[j] < ids[best])) {
                    best = j;
                }
            }

            int tempAttendance = attendance[i];
            attendance[i] = attendance[best];
            attendance[best] = tempAttendance;

            int tempId = ids[i];
            ids[i] = ids[best];
            ids[best] = tempId;
        }

        for (int i = 0; i < k; i++) {
            System.out.print(ids[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ids = new int[n];
        int[] attendance = new int[n];

        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rankEmployees(ids, attendance, k);
    }
}