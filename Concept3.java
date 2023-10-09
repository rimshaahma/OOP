/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concept3;
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

// Car class represents a car composed of an engine
class Car {
    Engine engine; // Composition - Car is composed of an Engine

    public Car() {
        this.engine = new Engine();
    }

    void start() {
        System.out.println("Car started");
        engine.start(); // Delegating the start operation to the Engine
    }
}

public class Concept3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car car = new Car();

        // Start the car
        car.start();
    }
}
