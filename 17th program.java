import java.util.ArrayList;

public void main() {
    // 1. Create an ArrayList of tasks
    ArrayList<String> todoList = new ArrayList<>();

    // 2. Add tasks to the list
    todoList.add("Buy groceries");
    todoList.add("Complete assignment");
    todoList.add("Call doctor");
    System.out.println("Initial To-Do List: " + todoList);

    // 3. Remove a task (by index or by value)
    todoList.remove("Complete assignment"); 
    System.out.println("After removing 'Complete assignment': " + todoList);

    // 4. Iterate over the ArrayList
    System.out.println("\nRemaining Tasks:");
    for (String task : todoList) {
        System.out.println("- " + task);
    }
}
