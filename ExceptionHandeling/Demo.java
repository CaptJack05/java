//Try used to write statment that might throw excption
// Catch used to handle the exception caused by try block
// throw used to cause user defined exception or explecit exception
// throws used to warn compiler what kind of exception a method might cause on compilation


// Throwable
//  ├── Exception (Checked exceptions)
//  │      ├── IOException
//  │      ├── SQLException
//  │      └── ClassNotFoundException
//  └── RuntimeException (Unchecked exceptions)
//         ├── NullPointerException
//         ├── ArithmeticException
//         └── IndexOutOfBoundsException

// Error (Serious problems, not handled in code)
//  ├── OutOfMemoryError
//  └── StackOverflowError


package ExceptionHandeling;
class Division{
    public int div(int a, int b){
        return a/b ;
    }
}

public class Demo {
    public static void main(String[] args) {
        Division obj = new Division();
    
        int result = 0;
        
        try{
            result = obj.div(0, 10);
            System.out.println("Rsult: "+ result);
            if(result == 0){
            throw new ArithmeticException("neglect 0");  //custom Exception
            }

        }
        catch(ArithmeticException e){
            result = 1;
            System.out.println("Cannot divide by 0 1 default value" + e);
            
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }

        System.out.println("completed");

        
    }
    
    

    
}
