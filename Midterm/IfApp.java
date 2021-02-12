import java.util.Scanner;
public class IfApp
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("n1: ");
      int number1 = input.nextInt();
      
      System.out.print("n2: ");
      int number2 = input.nextInt();
      
      System.out.print("n3: ");
      int number3 = input.nextInt();
      
      int product = number1 * number2 * number3;
      
      if (product>75)
      {
         System.out.print("This is a large product");
      }
      else
      {
         System.out.printf("%d * %d * %d = %d", number1, number2, number3, product);
      }
   }
}