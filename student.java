// Student class definition
class Student {
    int id;
    String name;
    double marks;

    // Constructor to initialize student details
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Student ID    : " + id);
        System.out.println("Student Name  : " + name);
        System.out.println("Student Marks : " + marks);
        System.out.println("-------------------------");
    }
}

// Main class containing the entry point
public class Main {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student(101, "Rahul", 85.5);
        Student student2 = new Student(102, "Priya", 92.0);

        // Displaying student details
        student1.display();
        student2.display();
    }
}
