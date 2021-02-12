package javaapplication1;
import java.io.*;
import java.io.FileWriter;
import java.lang.*;
import java.util.*;
public class JavaApplication1 {
    
    
    public static void main(String[] args) throws IOException {
        
        
        //1 Create a file
        File file = new File("payroll.txt");
        //2 Creat a file writer class
        FileWriter fw = new FileWriter(file);
        //3 create a printer writer class
                PrintWriter pw = new PrintWriter(fw);
                pw.println("Bob Jones " + "40.0 " + "10.25 ");
                pw.println("Sam Smith" + " 45.5" + " 15.00");
                pw.println("Jodi White" + " 32.25" + " 20.50");
                
                pw.close();
    }
}
