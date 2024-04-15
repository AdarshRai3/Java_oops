package src.main.properties.Abstraction;

abstract class Parent {
    abstract void career(String name);
    abstract void partner(String name, int age);
}
//Abstraction is the process of hiding the unnecessay details and showing only the essential ones 
//when we create an  abstract method, the child class also have to be abstract 
//In abstract method we dont write any body of the method we give child class to implement the body of the method by itself