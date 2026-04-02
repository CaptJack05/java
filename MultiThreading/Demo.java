// s
package MultiThreading;

class A extends Thread {
    public void run() {
        System.out.println("Display from class A");
    }
}
class B extends Thread {
    public void run(){
        System.out.println("in Class B");
    }
}
public class Demo {
    public static void main(String args[]){

        A objA = new A();
        B objB = new B();

        objA.start();
        objB.start();   


    }
    
}
