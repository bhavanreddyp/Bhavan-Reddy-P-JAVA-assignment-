import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area using A = π * r^2
        double area = Math.PI * radius * radius;

        // Display the calculated area
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}

