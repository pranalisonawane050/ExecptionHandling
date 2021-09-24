import java.io.*;
import java.io.FileNotFoundException;
public class FileNotFoundExceptionExample
{
    	
            public void checkFileNotFound()
            {
            	System.out.println(new File("input.txt").getAbsolutePath());
                try
                {
                    FileInputStream in = new FileInputStream("input.txt");
                    System.out.println("This is not printed");
                    
                    while(true)	
                    {
                    	int i = in.read();
                    	if(i==-1) {
                    		break;	
                    	}
                    	System.out.print((char)i);	
                    }
						
                } 
                catch (Exception e)
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