
public class ExecptionsTypes {
	// ArithmeticException
	 public static void main(String args[])
	    {
	        try {
	            int a = 30, b = 0;
	            int c = a/b;  // cannot divide by zero
	            System.out.println ("Result = " + c);
	        }
	        catch(ArithmeticException e) {
	            System.out.println ("Can't divide a number by 0");
	        }
	    }
	    
	
	/* NullPointerException
	public static void main(String args[])
    {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
	*/
	
	/*StringIndexOutOfBoundsException
	public static void main(String args[])
    {
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
	 */
	
	
	/*FileNotFoundException
	 
	 public static void main(String args[])  {
        try {
 
            // Following file does not exist
            File file = new File("E://file.txt");
 
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
           System.out.println("File does not exist");
        }
    }
	 */
	/*
	public static void main(String args[])
    {
        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
                      // size 5
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
	*/
	
}
