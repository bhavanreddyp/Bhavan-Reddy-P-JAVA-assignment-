class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the toString method inherited from the Object class
    @Override
    public String toString() {
        return "Person[Name: " + name + ", Age: " + age + "]";
    }
}

public class ToStringOverrideDemo {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        // Printing the object directly invokes its toString() method
        System.out.println(person);
    }
}
