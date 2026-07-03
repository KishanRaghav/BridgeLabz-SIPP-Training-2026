public class Course<T extends CourseType> {

    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void displayCourse() {
        System.out.println(courseType);
    }
}