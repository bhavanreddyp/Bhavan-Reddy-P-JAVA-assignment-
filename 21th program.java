class Student {
    private String name;
    private int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating two objects of the Student class
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 92);

        // Displaying details of both student objects
        System.out.println("--- Student Details ---");
        student1.displayInfo();
        student2.displayInfo();
    }
}
