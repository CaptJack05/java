// BufferReader and Scanner

//System.in.read() :--> Gives ascaii value of char

//Buffer Reader : - from java.io package -> Faster > reads input as string only > require parsing.
// Key Points:
// readLine() → reads input as a String
// For numbers, use parsing:
// Integer.parseInt()
// Double.parseDouble()
// Float.parseFloat()
// Must handle IOException.

//Scanner : form java.util package > esire support primitive data type and string > use expression
// Key Methods:
// next() → reads a word (till space).
// nextLine() → reads an entire line.
// nextInt() → reads integer.
// nextDouble() → reads double.
// hasNextXXX() → checks if the next input matches type.
// ⚠️ Limitation: Slightly slower than BufferedReader because it uses regex parsing.


package UserInput;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;



public class Demo {
    public static void main(String[] args) throws IOException{   // Due to bufferReader object
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();  // Reads entire line
        System.out.println(name);
        int numval = sc.nextInt();
        System.out.println(numval);
        


        BufferedReader br =  new BufferedReader(null);  
        int num = Integer.parseInt(br.readLine());    // conver stirng to int
        System.out.println((num));

        br.close();


    }
    
}
