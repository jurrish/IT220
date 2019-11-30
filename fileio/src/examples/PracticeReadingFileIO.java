package examples;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class PracticeReadingFileIO
{
    public static void main(String[] args)
    {
        Scanner reader = null;
        try
        {
            reader = new Scanner(new FileInputStream("speech.txt"));

            //read from our file
            while(reader.hasNextLine())
            {
                //read in the next line
                String line = reader.nextLine();

                //do something with the next line
                if(line.length() > 30)
                {
                    System.out.println(line.substring(0,30) + "...");
                }
                else
                {
                    System.out.println(line);
                }
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("error reading from file: " + ex.getMessage());
        }
        finally
        {
            if(reader != null)
            {
                reader.close();
            }
        }
    }
}
