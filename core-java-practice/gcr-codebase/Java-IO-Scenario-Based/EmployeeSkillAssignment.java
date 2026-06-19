import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSkillAssignment {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String department = sc.nextLine();
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("employee.dat"));

        oos.writeObject(emp);
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("employee.dat"));

        Employee e = (Employee) ois.readObject();

        System.out.println(e.employeeId);
        System.out.println(e.name);
        System.out.println(e.department);
        System.out.println(e.salary);

        ois.close();
    }
}