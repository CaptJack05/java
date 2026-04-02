// abstract method -> it's a type of method that dose not have body  or we cans say undefined method
// abstract Class -> class containig abstract method 
// abstract class cannot be instiated i.e cannot make object of abstract class

package AbstractClass;


public class Demo {
    public static void main(String args[]){
        Suzuki obj = new Suzuki();
        obj.drive();
        obj.playMusic();

    }
    
}

abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing music");
    }
    
}

class Suzuki extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}
