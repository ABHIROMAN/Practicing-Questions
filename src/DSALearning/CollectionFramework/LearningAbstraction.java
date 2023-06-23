package DSALearning.CollectionFramework;

public class LearningAbstraction {
    public static void main(String[] args) {

        Employee obj = new Employee();
        Person pObj = obj;
        LivingBeing lObj = obj;
//        Person p1 = new Person();
        // You can't do it b/c person is interface not class
        //You can't instantiate like that

//        Vehicle v1 = new Vehicle();
        // Same goes for Vehicle b/c it's an abstract class which is just a concept
        // We can use like this

        Vehicle v1 = new Bike(); //This is called Casting
    }
}

// Using Abstract keyword

abstract class Vehicle {
    abstract void starts();
    void breaks() {
        System.out.println("Vehicle breaks");
    }
}

class Bike extends Vehicle {
    @Override
    void starts() {

    }
}
class Car extends Vehicle {
    @Override
    void starts() {
    }
}

// Using Interfaces

interface Person {
     void walk();
}

interface LivingBeing {
    void breathe();
}

class Employee implements Person, LivingBeing { // Supports Multiple Inheritance

    @Override
    public void walk() {
    }
    @Override
    public void breathe() {

    }
}
