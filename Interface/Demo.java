package Interface;
// An interface in Java is a contract that defines methods without implementations 

// Main class to run the program
public class Demo {
    public static void main(String args[]) {
        // Creating objects using polymorphism
        Sys os1 = new Windows(); // Windows is a subclass of Sys
        Sys os2 = new Ubantu();  // Ubantu is a subclass of Sys

        // Creating an object of Project1
        Project1 obj2 = new Project1();

        // Calling os() method with different OS types
        obj2.os(os1);  // Calls stats() and show() of Windows
        obj2.os(os2);  // Calls stats() and show() of Ubantu
    }
}

// Interface A with one abstract method
interface A {
    void show(); // No implementation here, just a declaration
}

// Interface B extends interface A, so it inherits show() too
interface B extends A {
    void stats(); // Another method to be implemented
}

// Sys class implements interface B (and indirectly A)
// So, it must provide implementations for show() and stats()
class Sys implements B {
    public void show() {
        System.out.println("Show method of Sys"); // Default show
    }

    public void stats() {
        System.out.println("These are the Stats"); // Default stats
    }
}

// Windows is a subclass of Sys and overrides show()
class Windows extends Sys {
    public void show() {
        System.out.println("This is the Window-OS"); // Custom show
    }
}

// Ubantu is another subclass of Sys and also overrides show()
class Ubantu extends Sys {
    public void show() {
        System.out.println("This is the Ubantu-OS"); // Custom show
    }
}

// Project1 class has a method that accepts any Sys object
class Project1 {
    public void os(Sys oSys) {
        // Calls the stats() and show() of the object passed (dynamic binding)
        oSys.stats(); // Always from Sys unless overridden
        oSys.show();  // Polymorphic — depends on the actual class (Windows/Ubantu)
    }
}
