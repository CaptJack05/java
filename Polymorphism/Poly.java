package Polymorphism;
// Method overloading --> compile time plymorphism
// Method Overiding  --> Run time polymorphism --> Dynamic Method Dispatch


public class Poly {
    public static void main(String args[]){
        Animal obj = new Animal();

        obj.sound();
        Dog objDog = new Dog();
        objDog.sound();

        Animal objCat = new Cat(); //Upcasiting  
        objCat.sound();

        
    }
}