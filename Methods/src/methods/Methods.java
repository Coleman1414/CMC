package methods;

import java.util.Scanner;

public class Methods
{

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();
        System.out.println("Enter another number: ");
        int b = s.nextInt();
        System.out.println("Enter another number: ");
        int c = s.nextInt();

        triangleType(a, b, c);

    }

    public static void triangleType(int a, int b, int c)
    {
        if (a + b <= c) {
            System.out.println("Invalid Triangle");
        }
        else if (a != c) {
        System.out.println("Equilateral");
        }
        else if ((a != b) || (b != c)) {
        System.out.println("Isosceles");
    }
        else {
            System.out.println("Scalene");
        }
    }
}
