import java.util.Scanner; 
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
Scanner input = new Scanner(System.in);
//get users number
System.out.println("Please enter an integer to create a multiplication table for");
   int number = input.nextInt(); 

for(int i = 0; i <=12; i++){
   int answer= i * number;
 System.out.println(i + " X " + number + "=" + answer);
}
  }
}
