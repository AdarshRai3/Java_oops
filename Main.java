import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Your code here
        //Class: A class is the named group of properties and functions. Think of it as a car blueprint, it is logical construct that we use to create instance(actulal physical structure) called as object.Class is just the blueprint , but object is something that exist in the real world . That means object occpies the space in the memory
        class Student{
           int rno;
           String name;
           float marks;
           
           Student(int rollno, String name , float marks ){
            this.rno = rollno;
            this.name = name;
            this.marks = marks;
           }

           Student(Student other){
            this.name = other.name;
           }

           Student (String name){
            this.name = name;
           }

           Student(){
            //this is how you can call other constructor inside the constrctor 
            //internally , new Student(12,"Raj",98.5f)
            this(12,"Raj",98.5f);
           }

           void greeting(){
            System.out.println("Hi this is "+ this.name);
           }
           void changeName( String othername){
              this.name = othername;
           }


           @Override
           protected void finalize() throws Throwable {
               System.out.println("Object is destroyed ");
           }
           
        }
        //    Student obj;

        // for(long i =0; i<1000000000;i++){
        //     obj = new Student();
        //     System.out.println(obj);
        //    }  
        //whenever the memory get overloaded , the garbage collector run and it will destroy the objects and then finalize method will be called

        //Object: It is instance of the class the obejct has 3 essentail properties: State, Identity and behaviour.Object are stored in heap memory whereas as the refernce variable are stored in the stack memory and stack is faster than heap; The variable inside the object which are outside the method are called as instance variable which are use to create the object(instance of the class).
        //Create the onject in java we use reference varible=> Student s1 = new Student(); 
        // The new keyword dynamically allot memory to the object at run time and returns a refence variable in this case s1 to it. Student s1 = new Student(); The left side of the code excutes at compile time whereas the right part of the code execute at runtime and that time memory location take dynamically(memory allocation take place during runtime)
        //
        // Student S1 = new Student();
        // S1.name = "Adarsh";
        // S1.rno = 7;
        // S1.marks=90;

        //in the above intiation of the object : Student S1 = new Student(); in the above example we have to call the value continously to using dot operator to set the value of the instance variable for that object , to avoid this we can use consturctor => Student() but it is by default constructor, it name will be smae as the name of the class 

        //Constructor is the special type of the function in the class that runs whenever the object is created and it allocates some variable to the class.

        //Constructor name will be same as that of the class.
        // In constructor we use "this" keyword to bind the refernce vaiable of the current object to the instance variable values
        //"this" basically means which object you are referring currently. 

        // As in the above student class you can we that we have used 2 constructor with different argument this is called as function overloading which is concept of polymorphism

        // Calling constuctor from another constructor 
        Student S1 = new Student(3,"Adarsh",70.8f);
        S1.changeName("Priyansh");
        S1.greeting();
        System.out.println(S1.name);
        System.out.println(S1.rno);
        System.out.println(S1.marks);
         
        Student random = new Student(S1);
        
        System.out.println(random.name);
        Student random2  = new Student();

        System.out.println(random2.name);
        Student one = new Student();
        Student two = one;
        
        one.name = "Adarsh";
        System.out.println(two.name);
        //in this case two.name will be same as one.name ,means these refernce variable are just pointing to the object in the memory heap.
        //primitive datatype in java are stored in memory stack because in java primitive datatypes are not treated as object but as seprately as primitive that is why we dont have we dont use new keyword in java.
        // int a = 10; char a = 'a' these are not objects
        
        //Wapper classes
        //It is true that primitve datatype are not treated as object but we can use them as object by using wapper class in java 
        //Integer num = 12; now num is the object

        //We know that in java primitive datatypes are pass by value , but object can be pass by refernce 
        
        //Since the primitive datatype in java are only passed by value that means we cannot swap the value of these using the function swap which is taking the value like we do in C++. also we use wapper class to convert primitive datatypes(int a -> Integer a) into objects which are pass by reference then also we cannot swap the integer reason is that Integer class is final.
        
        //final keyword means that we cannot change it further its value is fixed also we should always initialise while declearing.
        
        //when the no-primitive is final we cannot reassign it

        final Student kunal = new Student("kunal");
        kunal.name ="james";
        //kunal = new Student(name : "Ajay") this reintialisation will give you an error because after using the final keyword we can't reintialise the class we can tweek with instance variable but not the class.
        

        //grabage collection:In java collection is automatic , unlike c++ where we have to use destructors to free the memory but in java we can use finalize() method to define the activities after garbage collection means we cannot destroy object but we can  decide what to do after the object is destroyed.
         
     
         
        
    } 
   

}


