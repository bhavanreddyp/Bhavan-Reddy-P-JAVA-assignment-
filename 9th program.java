public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {25, 11, 7, 75, 56};

        // Assume the first element is the largest
        int max = numbers[0];

        // Loop through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest element in the array is: " + max);
    }
}
