package practice.readwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWritePractice {
    public static void main(String[] args) {

        // File write
        try{
            FileWriter writer =new FileWriter("Test.txt",true); // if true is mentioned it'll be in append mode

            writer.write("I owns Los Pollos Hermanos restaurant chain\n");
            writer.close();
            System.out.println("File written Successfully");
            System.out.println();


        } catch (IOException e) {
            System.out.println("The input is not good");
        }


        //file read
        try {
            File file = new File("Test.txt");
            Scanner scanner = new Scanner(file);
            System.out.println("File is being read ");
            System.out.println();

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        }
        catch (FileNotFoundException e){
            System.out.println("File is not there");
        }

    }
}
