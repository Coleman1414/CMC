package spacley.sprockets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpacelySprockets
{

    public static void main(String[] args)
    {
        File orderinfo;
        orderinfo = new File("sprocketorders.txt");
        int part1total = 0, part2total = 0, part3total = 0, part4total = 0, part5total = 0;

        try {
            Scanner in = new Scanner(orderinfo);

            while (in.hasNext()) {
                int quantity = 0;
                int snum = in.nextInt();

                if (in.hasNext()) {
                    quantity = in.nextInt();
                } else {
                    System.err.println("Data not complete.");
                }

                switch (snum) {
                    case 1:
                        part1total = part1total + quantity;
                        break;
                    case 2:
                        part2total = part2total + quantity;
                        break;
                    case 3:
                        part3total = part3total + quantity;
                        break;
                    case 4:
                        part4total = part4total + quantity;
                        break;
                    case 5:
                        part5total = part5total + quantity;
                        break;
                    default:
                        System.out.println("Bad sprocket number");
                }
            }

            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\tSales Summary Report\nSprocket Number\t Total Quantity Sold");

        for (int snum = 1; snum < 6; snum++) {

            switch (snum) {
                case 1:
                    System.out.println("\t" + snum + "\t\t" + part1total);
                    break;
                case 2:
                    System.out.println("\t" + snum + "\t\t" + part2total);
                    break;
                case 3:
                    System.out.println("\t" + snum + "\t\t" + part3total);
                    break;
                case 4:
                    System.out.println("\t" + snum + "\t\t" + part4total);
                    break;
                case 5:
                    System.out.println("\t" + snum + "\t\t" + part5total);
                    break;
            }
        }
    }
}
