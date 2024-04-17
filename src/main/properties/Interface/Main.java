package src.main.properties.Interface;

public class Main implements B{

    public void fun(){

    }

    public void greet(){

    }
    public static void main(String args[]){
        // Car c = new Car();
        // c.start();
        // c.stop();
        // c.acc();
        // c.brake();
        //this will create the conflict when the method have the same name in both interface like start() and stop() both are present in MediaPlayer and Engine which will create ambugity when we call method with an object 

        //to resolve this we use refernce variable and seperate classes that can have same interfaces to resolve this ambiguity

        NiceCar car = new NiceCar();

        car.start();
        car.stop();
        car.startMusic();
        car.stopMusic();
        car.upgradeCarEngine();
        car.start();
        car.stop();

        //here we can see without creating an object we are able to access the methods just by using seperate classes in same Interface.
    }
}
//Interface 
//As of now we have seen that java dont support multiple inheritance due to the collisions but we can using interface 
//Interface are adjacent to class but with some major differences such as : all the instance varibles in interface are static final by default.
//We can implements multiple interfaces on the class that how we can achieve ability of mutiple inheritance in java 

//interface helps to inherit multiple interfaces in java using "implements" keyword instead of "extends" keyword

//Classes cant inherit and extends to multiple classes but can inherits multiple intefaces and implements multiple interfaces

//Interface solve the major problem of heiracrhy of class in java as in interface we have just interfaces and class in which we have to implement it there is parent class , child class and grand child class concept.

//Important part two class which are totally unrelated to eaach other can implements the same interfaces.Interfaces dont care wether two classes are related or not.

//Interface should not be used casually in performance critical code 

//we can use extend one interface A to another interface B to use the method of interface A in interface B and can implement B in the main class  

//seperate classes in same interface 