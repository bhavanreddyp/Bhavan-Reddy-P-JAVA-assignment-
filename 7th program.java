public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "Hello Java";

        // Method 1: length() - Returns the total number of characters
        int len = text.length();      
        System.out.println("Length: " + len);

        // Method 2: toUpperCase() - Converts all characters to uppercase
        String upper = text.toUpperCase(); 
        System.out.println("Uppercase: " + upper);

        // Method 3: charAt() - Returns the character at a specific index
        char ch = text.charAt(0);      
        System.out.println("First character: " + ch);
    }
}
