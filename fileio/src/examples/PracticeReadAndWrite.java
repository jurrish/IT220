package examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracticeReadAndWrite
{
        public static void main(String[] args) {
            Scanner reader = null;
            try {
                reader = new Scanner(new FileInputStream("records.txt"));

                //read from our file
                while (reader.hasNextLine()) {
                    //read in the next line
                    String line = reader.nextLine();

                    //give the split method our delimiter between our tokens
                    String[] parts = line.split(", ");

                    System.out.println("Employee Record");
                    System.out.println("***************");
                    System.out.println("ID: " + parts[0]);
                    System.out.println("Name: " + parts[1] + " " + "(" + parts[2] + ")" );
                    System.out.println("Hire date: "+ parts[3]);
                    System.out.println();
                }
            } catch (FileNotFoundException ex)
            {
                System.out.println("error reading from file: " + ex.getMessage());
            }
            finally
            {
                if (reader != null) {
                    reader.close();
                }
            }
        }

}
