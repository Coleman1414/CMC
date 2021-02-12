package sprocketswitharrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class SprocketsWithArrays extends JFrame
{

    public static void main(String[] args)
    {
        int[] sprocketArray = new int[50];

        try {
            Scanner scObj = new Scanner(new File("July orders.txt"));

            while (scObj.hasNextLine()) {
                String readline = scObj.nextLine();
                Scanner numeric = new Scanner(readline);
                int sprocketId = numeric.nextInt();
                int quantityAtIndex = numeric.nextInt();
                sprocketArray[sprocketId - 1] += quantityAtIndex;
            }
            String report = "";

            for (int i = 0; i < sprocketArray.length; i++) {
                report = report + "Sprocket Number: " + (i + 1)
                        + " Quantity Ordered: "
                        + sprocketArray[i] + "\n";
            }
            JFrame GUI = new JFrame("Spacely Sprocket Summary Report");
            GUI.setSize(500, 500);
            GUI.setLayout(new FlowLayout());
            GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JTextArea textArea = new JTextArea(20, 25);
            textArea.setEditable(false);
            textArea.setText(report);
            JScrollPane jsp = new JScrollPane(textArea);
            jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            GUI.getContentPane().add(jsp);
            GUI.setVisible(true);

        } catch (FileNotFoundException ex) {
            System.err.println("File not found !!");
        }
    }
}
