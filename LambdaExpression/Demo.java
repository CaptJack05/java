
//In Java, a lambda expression is a short way to write code that 
//implements a functional interface (an interface with exactly one abstract method).
// Function interface -> contain only abstract method
package LambdaExpression;
@FunctionalInterface
interface Stats{
    public void show(int i);
}


public class Demo {

    public static void main(String[] args) {
        Stats obj = (i) -> System.out.println("this is the datat :"+ i);
        obj.show(5);
        
    }

    
    
}
