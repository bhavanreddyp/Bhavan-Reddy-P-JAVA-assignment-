import java.util.HashSet;
import java.util.Set;

public class DistinctAbsoluteValues {
    public static int countDistinctAbsoluteValues(int[] arr) {
        Set<Integer> distinctAbsValues = new HashSet<>();
        
        for (int num : arr) {
            distinctAbsValues.add(Math.abs(num));
        }
        
        return distinctAbsValues.size();
    }

    public static void main(String[] args) {
        int[] arr = {-5, 5, 1, -1, 0, 2};
        System.out.println(countDistinctAbsoluteValues(arr)); // Output: 4
    }
}
