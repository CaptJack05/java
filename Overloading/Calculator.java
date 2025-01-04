package Overloading;

public class Calculator {
    public static void main(String args[]){
        Add addObj = new Add();
        addObj.add();
        addObj.add(5,6);
    }
    
}
