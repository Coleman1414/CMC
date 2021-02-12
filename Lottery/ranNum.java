import java.util.Arrays;
import java.util.Random;

public class ranNum
{

          public static void ranNumber()
    {

        Random rand = new Random();
        int min = 1, max = 49, slots = 6;

        int[] lotteryArray = new int[slots];
        boolean isRepeated;
        int randomNumber = 0;

        for (int CPUNum = 0; CPUNum < slots; CPUNum++) {
            do {
                isRepeated = false;

                randomNumber = rand.nextInt(max + 1 - min) + min;

                for (int k = 0; k <= CPUNum; k++) {

                    if (lotteryArray[k] == randomNumber) {
                        isRepeated = true;
                        break;
                    }
                }

            } while (isRepeated);
            lotteryArray[CPUNum] = randomNumber;
        }
        Arrays.sort(lotteryArray);
        System.out.print("Winning Numbers: ");
        for (int i = 0; i < slots; i++) {
            System.out.print(lotteryArray[i] + " ");
        }

    }

    public static void main(String[] args)
    {
         
            ranNum.ranNumber();
    }
}