package Enum;

// Enum (short for Enumeration) is a special data type in Java 
// used to define a set of constant values.
// These are useful when a variable should have one value from a small set of predefined values.

// Defining enum Status with 4 possible constant values
enum Status {
    Running, Failed, Pending, Success
}

// Defining enum Load with custom values (using constructors)
enum Load {
    Server1(5000), Server2(2000), Server3(); // Server3 uses the default constructor

    private int load; // field to hold the load value

    // Parameterized constructor for Load enum
    private Load(int load) {
        this.load = load;
    }

    // Default constructor - used when no value is passed
    private Load() {
        load = 0;
    }

    // Getter method for load
    public int getLoad() {
        return load;
    }

    // Setter method for load (can be used to change load at runtime)
    public void setLoad(int load) {
        this.load = load;
    }
}

public class Demo {
    public static void main(String[] args) {

        // Assign enum constants to variables
        Status s = Status.Success;
        Load l = Load.Server1;

        // Using switch-case with Load enum
        switch (l) {
            case Server1:
                System.out.println(l + ": " + l.getLoad()); // prints Server1 and its load
                l.setLoad(500000); // modifying the load value using setter
                break;

            default:
                break;
        }

        // Using switch-case with Status enum
        switch (s) {
            case Success:
                System.out.println("Successful");
                break;

            case Failed:
                System.out.println("Failed");
                break;

            default:
                System.out.println("null");
                break;
        }

        // Loop through all Load enum values
        for (Load ls : Load.values()) {
            // Print each server and its current load
            System.out.println(ls + " : " + ls.getLoad());
        }
    }
}
