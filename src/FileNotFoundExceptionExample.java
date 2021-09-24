import java.io.*;
import java.io.FileNotFoundException;
public class FileNotFoundExceptionExample
{
    	public static void main(String args[])  {
            try {
    
                File file = new File("E://file.txt");
                FileReader fr = new FileReader(file);
            } catch (FileNotFoundException e) {
               System.out.println("File does not exist");
               System.out.println(e);
            }
        }
}