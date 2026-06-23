public class Course{
String courseName; int duration; double fee;
static String instituteName="ABC Institute";
Course(String c,int d,double f){courseName=c;duration=d;fee=f;}
void displayCourseDetails(){System.out.println(courseName);}
static void updateInstituteName(String n){instituteName=n;}
}