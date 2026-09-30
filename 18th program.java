import java.util.LinkedList;

public void main() {
    // 1. Create a LinkedList of elements
    LinkedList<String> list = new LinkedList<>();

    // Add elements
    list.add("Apple");
    list.add("Banana");
    list.add("Cherry");
    list.add("Date");
    System.out.println("Initial LinkedList: " + list);

    // 2. Accessing elements
    String firstElement = list.getFirst(); // Access first element
    String lastElement = list.getLast();   // Access last element
    String elementAtIndex1 = list.get(1);  // Access element at index 1

    System.out.println("First Element: " + firstElement);
    System.out.println("Last Element: " + lastElement);
    System.out.println("Element at Index 1: " + elementAtIndex1);

    // 3. Removing elements using LinkedList operations
    list.removeFirst(); // Removes head ("Apple")
    list.removeLast();  // Removes tail ("Date")
    list.remove(0);     // Removes current index 0 ("Banana")

    System.out.println("LinkedList after removals: " + list);
}
