import java.util.Scanner;

public class UserInput
{

    public static void userInput()
    {
        Scanner input = new Scanner(System.in);
        String user;
        int luckyNum1;
        int luckyNum2;
        int luckyNum3;
        int luckyNum4;
        int luckyNum5;
        int luckyNum6;

        System.out.println("Mega-Millions Lottery");
        System.out.println("Please select 6 Lucky Numbers between 1-49 for a chance to win $85 Million!\n\nHere are the rules, You will select any 6 numbers between 1-49. if any of those numbers match up in any order you will win something!");

        System.out.println("\n\nWould you like to see the prizes!: Yes/No");
        user = input.nextLine();

        if (user.equalsIgnoreCase("yes")) {
            System.out.println("\n\n\n\n\n\n\n\nGreat! Here they are! \n\n 1 Number Correct: Is a sad feeling \n 2 Numbers Correct: 5$ \n 3 Numbers Correct: 100$ \n 4 Numbers Correct: 500$ \n 5 Numbers Correct: 100,000$ \n 6 Numbers Correct: The Grand Prize 85 Million Dollars ");
        }
        if (user.equalsIgnoreCase("no")) {
            System.out.println("Rude! I guess you will just have to be surprised!");
        }

        System.out.print("\n Please enter Your Lucky Number 1: ");
        luckyNum1 = input.nextInt();

        System.out.print("\n\n\n\n\n\n\n\n\n\nPlease enter Your Lucky Number 2: ");
        luckyNum2 = input.nextInt();

        System.out.print("\n\n\n\n\n\n\n\n\n\nPlease enter Your Lucky Number 3: ");
        luckyNum3 = input.nextInt();

        System.out.print("\n\n\n\n\n\n\n\n\n\nPlease enter Your Lucky Number 4: ");
        luckyNum4 = input.nextInt();

        System.out.print("\n\n\n\n\n\n\n\n\n\nPlease enter Your Lucky Number 5: ");
        luckyNum5 = input.nextInt();

        System.out.print("\n\n\n\n\n\n\n\n\n\nPlease enter Your Lucky Number 6: ");
        luckyNum6 = input.nextInt();
        System.out.printf("\n\n\n\n\n\n\n\nLucky Numbers: %d, %d, %d, %d, %d, %d", luckyNum1, luckyNum2, luckyNum3, luckyNum4, luckyNum5, luckyNum6);
        System.out.println("");
    }

    public static void main(String[] args)
    {

        UserInput.userInput();

    }
}