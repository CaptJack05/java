package Final_keyword;

// final -> variable, method , class

// with variable it used to make constatant i.e values that can't be changed 
// with class it is used to stop inheritance of the class
// with methods it is used to stop method overriding 


public class Final {


    public static void main(String a[]){
        advCalc objCalc = new advCalc();
        objCalc.credit();
        objCalc.add(5, 8);

    }
    
}

class calc{
    final public void credit(){
        System.out.println("made by Hc");
    }

    public void add(int a, int b ){
        System.out.println(a + b);

    }
}


class advCalc extends calc{
    public void add(int a, int b){
        System.out.println(a -b);
    }


}
