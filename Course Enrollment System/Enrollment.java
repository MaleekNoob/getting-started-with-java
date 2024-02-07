import java.util.ArrayList;

public class Enrollment {
    private ArrayList<Student> studentList;

    public Enrollment() {
        this.studentList = new ArrayList<>();
    }
    
    public void enroll(Student student, Course course) {
        studentList.add(student);
        student.getCourses().add(course);
        System.out.println("Enrolled " + student.getName() + " to " + course.getCourseName());
    }

    public void drop(Student student, Course course) {
        studentList.remove(student);
        student.getCourses().remove(course);
        System.out.println("Dropped " + student.getName() + " from " + course.getCourseName());
    }

    public void displayStudentRecord(Student student) {
        student.displayStudentDetails();
        System.out.println("Student Courses: ");
        for (Course course : student.getCourses()) {
            System.out.println(course.getCourseCode() + " " + course.getCourseName());
        }
    }

}
