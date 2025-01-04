package Overloading;

public class Add {

    void add(){
        System.out.println("Error : Enter parameters on calling the methods");
    }

    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
}
