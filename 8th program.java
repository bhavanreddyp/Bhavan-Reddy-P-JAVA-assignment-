import java.util.Scanner;

public class SentenceRebuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Split the sentence into an array of words
        String[] words = sentence.split("\\s+");
        
        // Rebuild the sentence in a new format (e.g., reversed order with hyphen separator)
        StringBuilder newFormat = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            newFormat.append(words[i]);
            if (i != 0) {
                newFormat.append("-");
            }
        }
        
        System.out.println("Rebuilt format: " + newFormat.toString());
        scanner.close();
    }
}
