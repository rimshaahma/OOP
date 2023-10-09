/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concept4;
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Derived class representing a specific type of animal (Dog)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Derived class representing another specific type of animal (Cat)
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
public class Concept4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Polymorphic behavior - calling makeSound on different types of animals
        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
