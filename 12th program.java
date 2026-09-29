import java.util.Arrays;

public class Main {
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers toward the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        reverseArray(numbers);
        
        // Output: [5, 4, 3, 2, 1]
        System.out.println(Arrays.toString(numbers));
    }
}
