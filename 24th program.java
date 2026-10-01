import java.util.*;

public class Main {
    public static int countAnagrammaticGroups(String[] arr) {
        // Set to store unique canonical key representations of anagrams
        Set<String> uniqueGroups = new HashSet<>();
        
        for (String str : arr) {
            // Sort characters of the string to form a canonical key
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            // Add the sorted string key to the Set
            uniqueGroups.add(sortedStr);
        }
        
        // The size of the set represents the number of distinct anagrammatic groups
        return uniqueGroups.size();
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Number of anagrammatic groups: " + countAnagrammaticGroups(words));
    }
}
