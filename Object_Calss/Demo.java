package Object_Calss;
// obj is super class of all class
// it is inbuilt class

// obj has inbuilt methods like hashCode() and equals()
// String toString()	Returns a string representation of the object.
//boolean equals(Object obj)	Compares two objects for logical equality.
//int hashCode()	Returns a hash code for the object (used in hashing collections).

public class Demo {
    public static void main(String args[]){
        Laptop Laptop1 = new Laptop();
    Laptop Laptop2 = new Laptop();
    
    Laptop1.price = 5000 ;
    Laptop1.model = "Latitude";

    Laptop2.price = 5000 ;
    Laptop2.model = "Latitude";

    boolean result = Laptop1.equals(Laptop2);

    System.out.println(result);

    }
}


class Laptop{
    String model;
    int price;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}
