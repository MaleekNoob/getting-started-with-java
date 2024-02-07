public class Main {

    public static void main(String [] args) {
        Enrollment enrollment = new Enrollment();
        Student student1 = new Student(1, "Juan", 18);
        Student student2 = new Student(2, "Pedro", 19);
        Student student3 = new Student(3, "Maria", 20);
        Course course1 = new Course("CMSC 22", "Object-Oriented Programming");
        Course course2 = new Course("CMSC 11", "Web Programming");
        Course course3 = new Course("CMSC 56", "Mobile Programming");
        enrollment.enroll(student1, course1);
        enrollment.enroll(student1, course2);
        enrollment.enroll(student2, course1);
        enrollment.enroll(student2, course3);
        enrollment.enroll(student3, course2);
        enrollment.enroll(student3, course3);
        System.out.println("Student Records: ");
        enrollment.displayStudentRecord(student1);
        enrollment.displayStudentRecord(student2);
        enrollment.displayStudentRecord(student3);

        System.out.println("\nDropping students from courses...");
        enrollment.drop(student1, course1);
        enrollment.drop(student2, course3);
        enrollment.drop(student3, course2);
        System.out.println("Student Records: ");
        enrollment.displayStudentRecord(student1);
        enrollment.displayStudentRecord(student2);
        enrollment.displayStudentRecord(student3);
    }
    
}
