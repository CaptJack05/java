package InnerClass;

public class Demo {
    public static void main(String args[]){

        A obj = new A()
        {
            public void show()    // Anonmous inner class is nameless inline class
            {
                System.out.println("in anonmous Inner Class");
            }
            public void showAll(){
                System.out.println("This is the Abstract method");
            }
        };
    obj.show();
    A.Inner obj1 = obj.new Inner();   //Making object of inner class of class A
    obj1.property();
    obj.showAll();


    }

    
}

abstract class A{
    public void show(){
        System.out.println("In class A");
    }

    class Inner{
        public void property(){
            System.out.println("in INNer class");
        }
    }

    public abstract void showAll();
}
