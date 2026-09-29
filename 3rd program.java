import java.util.Scanner;

public class StudentGradeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();

        // 1. Assign Grade 'A' for marks above 90
        if (marks > 90) {
            System.out.println("Grade: A");
        }

        // 2. Check if student has passed (pass mark is 40)
        if (marks >= 40) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        scanner.close();
    }
}
