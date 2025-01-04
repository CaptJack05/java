class Hp{
    public void show(){
        System.out.println("in Hp");
    }
}

class omen extends Hp{
    public void show(){
        System.out.println("in omen");
    }
}


public class computer {
    public static void main(String args[]){

        Hp compny = new Hp();
        compny.show();
    }
    
}
