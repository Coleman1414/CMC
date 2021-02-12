import java.util.Scanner;

public class LotteryGame
{

    public static void Win()
    {

        Scanner input = new Scanner(System.in);
        String userInput;

        System.out.println("\n\nDo you have any winning numbers: Yes/No");
        userInput = input.nextLine();

        if (userInput.equalsIgnoreCase("yes")) {

            System.out.println("\n\n\n\n\n\n\n\nHow many numbers:");
            userInput = input.nextLine();
        }

        if (userInput.equals("1")) {
            System.out.println("\n\n\n\n\n\n\n\nCongratulations!\nYou win a sad feeling!\nYou do not need to turn your ticket in to win this prize!");
        }
        if (userInput.equals("2")) {
            System.out.println("\n\n\n\n\n\n\n\nCongratulations!\nYou win your money back! Maybe you should play again!");
        }
        if (userInput.equals("3")) {
            System.out.println("\n\n\n\n\n\n\n\nCongratulations!\nYou are a winner! Enjoy that 100$");
        }
        if (userInput.equals("4")) {
            System.out.println("\n\n\n\n\n\n\n\nCongratulations!\nDont spend it all in one place!");
        }
        if (userInput.equals("5")) {
            System.out.println("\n\n\n\n\n\n\n\nCongratulations!\nWhat are you going to do with all that cash!");
        }
        if (userInput.equals("6")) {
            System.out.println("\n\n\n\n\n\n\n\nCongratulations!\nYou have won 85 Million Dollars! ");
        }
    }

    public static void main(String[] args)
    {
        UserInput.userInput();
        ranNum.ranNumber();
        LotteryGame.Win();
        System.out.println("\n\nRemember that any fraudulant behavior will be turned over to law enforcement");
    }
}