package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PracticePrintWriter
{
    public static void main(String[] args)
    {
        PrintWriter writer = null;
        try
        {
            writer = new PrintWriter(new FileOutputStream("output.txt"));

            //write dummy data to a file called output.txt
            System.out.println("writing to my file output.txt");
            writer.println("Helloworld");

            writer.print(100);
            writer.print(" ");
            writer.print(200);
            writer.print(" ");
            writer.print(300);
            writer.println();

            //close our connection to our file
            writer.close();
            System.out.println("writing to output.txt. closing file connection...");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Problem writing to a file: " + ex.getMessage());
        }
        finally
        {
            //scenario #1 - try block completes without error
            //and then finally block runs
            //scenario #2 - error in try block, exception is thrown and caught,
            //then finally block runs
            //scenario #3 - exception is thrown in try block, and not caught by catch
            //then finally block runs
            if(writer != null)
            {
                writer.close();
            }
        }
    }
}
