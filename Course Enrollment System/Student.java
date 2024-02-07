import java.util.ArrayList;

public class Student {
	private int id;
	private String name;
	private int age;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        courses = new ArrayList<Course>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayStudentDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
