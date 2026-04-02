package TypeCasting;

// Parent Class Super Class
class A{
    public void show(){
        System.out.println("In A Show");
    }
}

// B is Sub class or Child  class of A
class B extends A{     
    public void show2(){
        System.out.println("In class B");
    }

    
}

public class Demo {
    public static void main(String args[]){

        A obj = new B();

        B obj2 = (B) obj;  // Downcasting   // suprclass A  object --> B type object 
                                            //or  child class  object --> parent class

        obj.show();
        obj2.show2();
    }
    
}
