import java.util.ArrayList;
import java.util.List;

// Student class representing individual student records
class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private double gpa;

    // Constructor to initialize student details
    public Student(int id, String name, int age, String course, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
        System.out.println("----------------------------");
    }
}

// Main class name matches the file name 'student.java'
public class student {
    public static void main(String[] args) { // Fixed 'voidmain' to 'void main'
        // Create a list to store multiple students
        List<Student> studentList = new ArrayList<>();

        // Adding sample student records
        studentList.add(new Student(101, "Alice Smith", 20, "Computer Science", 3.8));
        studentList.add(new Student(102, "Bob Jones", 22, "Mechanical Engineering", 3.4));
        studentList.add(new Student(103, "Charlie Brown", 21, "Business Administration", 3.6));

        // Displaying all student records
        System.out.println("=== Student Information Records ===");
        for (Student s : studentList) {
            s.displayStudentInfo();
        }
    }
}
