

// Parent class
class Person {
    protected String name;
    protected int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}


class Student extends Person {
    protected final String studentId;   // final studentId
    protected double cgpa;


    public Student(String name, int age, String studentId, double cgpa) {
        super(name, age);
        this.studentId = studentId;
        this.cgpa = cgpa;
    }


    @Override
    public String toString() {
        return super.toString()
                + ", Student ID: " + studentId
                + ", CGPA: " + cgpa;
    }
}

class GradStudent extends Student {
    private String thesis;


    public GradStudent(String name, int age, String studentId,
                       double cgpa, String thesis) {
        super(name, age, studentId, cgpa);
        this.thesis = thesis;
    }


    @Override
    public String toString() {
        return super.toString()
                + ", Thesis: " + thesis;
    }
}


public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Alice",
                24,
                "S101",
                3.92,
                "Artificial Intelligence in Education"
        );


        System.out.println(gs);


        Student s = gs;
        Person p = gs;

        System.out.println("\nIS-A Relationship Demonstration:");
        System.out.println("GradStudent IS-A Student:");
        System.out.println(s);

        System.out.println("\nGradStudent IS-A Person:");
        System.out.println(p);

        // instanceof
        System.out.println("\ninstanceof Results:");
        System.out.println("gs instanceof GradStudent: " + (gs instanceof GradStudent));
        System.out.println("gs instanceof Student: " + (gs instanceof Student));
        System.out.println("gs instanceof Person: " + (gs instanceof Person));
    }
}