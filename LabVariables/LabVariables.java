import java.util.Scanner;

public class LabVariables {


public static void main(String[] args)
{

int kingsPeak = 4214;
int timpanogos = 3581;

Scanner input = new Scanner(System.in);
System.out.print("What is your favorite destination?");
String destination = input.nextLine();
System.out.printf("Welcome to %s" , destination );
System.out.println("");
System.out.println("");
System.out.println("");
System.out.printf("Elevation of Kings peak: %d", kingsPeak );
System.out.println("");
System.out.printf("Elevation of Timpanogos: %d", timpanogos);

}
}