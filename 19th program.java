public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            // 1. Un-comment to trigger ArithmeticException:
            int result = 10 / 0; 

            // 2. Un-comment to trigger ArrayIndexOutOfBoundsException:
            // int[] numbers = {1, 2, 3};
            // int element = numbers[5];

        } catch (ArithmeticException e) {
            System.out.println("Catch Block: Arithmetic Exception caught -> " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch Block: Array Index Out Of Bounds Exception caught -> " + e.getMessage());
        } finally {
            System.out.println("Finally Block: This block always executes regardless of exceptions.");
        }
    }
}
