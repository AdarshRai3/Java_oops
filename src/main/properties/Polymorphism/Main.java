package src.main.properties.Polymorphism;

public class Main {
    
    public static void main(String[]args){
       
       Shapes shapes = new Shapes();

       shapes.area();
     
       Square square = new Square();

       square.area();

       Circle circle = new Circle();

       circle.area();

       Triangle triangle = new Triangle();
      
       triangle.area();

    
       
    }
}
//Polymorphism 
// It means using same thing in different ways 
// In Java we have two types of polymorphism 
// 1>Static/Compile time polymorphism(method overloading)
// Method overloading means when the class having the multiple functions(methods, constructors) with the same name but are different on the bases of number of arguments, return types and datatypes.
//EX: A a = new A(); A b = new A(3,4); A c = new A(3,4,5);this is called compile time polymorphism because in this java can determine on compile time which method should be called.
// 2>Dyanamic/Run Time  polymorphism(method overiding)
//Above example in the Main.java is the example of method overriding. In this we have area() method in parent class Shapes as well as child class circle but we can clearly see on the runtime child class method will override the parent class method,because that we created object that we created is the object of the child class since java is able to determine which method to call at runtime, hence this type of polymorphism is called dyanamic/runtime polymorphism.
// In java if we want to check wether the child class method override the parent class we use @Override annotation.
// if the annotation dont give us the error that means the method is overriding otherwise in case of the error it is not overriding 

