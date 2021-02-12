package powerof2;

public class Powerof2
{

    public static void main(String[] args)
    {
        Powersof2(1000000);

    }

    public static void Powersof2(int maxNum)
    {
        int pow = 1;
        for (int i = 1; i <= maxNum; i++) {
            pow = pow * 2;
            System.out.print(" \nThe powers of 2: " + pow);
        }
    }
}