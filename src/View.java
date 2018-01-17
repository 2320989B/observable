import java.util.Scanner;

// View is independent of Model and Controller.
public class View {

   // View to display a welcome message.
   public void welcome() {
      System.out.println("Welcome to the Shitty Adder!");
      System.out.println("============================");
   }

   // View to prompt for user input.
   public int numPrompt() {
      System.out.print("Enter an integer: ");
      Scanner in = new Scanner(System.in);
      int num;
      for (;;) {
         try {
            num = Integer.parseInt(in.nextLine());
            break;
         } catch (NumberFormatException e) {
            System.out.print("I said enter an integer: ");
         }
      }
      return num;
   }

   // View to display the result.
   public void showResult(int result) {
      System.out.println("Sum is: " + result);
   }

}
