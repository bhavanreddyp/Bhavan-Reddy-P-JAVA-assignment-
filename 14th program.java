class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Fox extends Animal {
    void sound() {
        System.out.println("The fox makes a sound.");
    }
}

class Rabbit extends Animal {
    void hop() {
        System.out.println("The rabbit hops.");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Fox fox = new Fox();
        Rabbit rabbit = new Rabbit();

        dog.eat();
        dog.bark();

        fox.eat();
        fox.sound();

        rabbit.eat();
        rabbit.hop();
    }
}
