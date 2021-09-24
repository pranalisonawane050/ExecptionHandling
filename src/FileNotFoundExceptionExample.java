import java.io.*;
import java.io.FileNotFoundException;
public class FileNotFoundExceptionExample
{
    public void checkFileNotFound()
    {
    	
    //	System.out.println(new File("input.txt").getAbsolutePath());
        try
        {            
        	FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
           
           
          
        } 
        catch (IOException e)
        {
        	
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args)
    {
        FileNotFoundExceptionExample example = new FileNotFoundExceptionExample();
        example.checkFileNotFound();
    }
}