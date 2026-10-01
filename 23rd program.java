import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Map to store (number -> index)
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement exists in map, return indices in ascending order
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current element and its index
            map.put(nums[i], i);
        }

        // Return [-1, -1] if no solution is found
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // Output: [0, 1]
    }
}
