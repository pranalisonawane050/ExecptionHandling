
public class MultipleTry {
	public static void main(String[] args) {
		//String str = null;
		//System.out.print(str.length());
		
		try {
			int a=20 ,b=0 ;
	        int c = a / b;
	        System.out.println("The result is " + c);
	    }
	    catch(ArithmeticException e) {
	        System.out.println("We failed to divide. Reason: ");
	        System.out.println(e);
	    }
	    
	    try{
	    	try {
				int num = Integer.parseInt("WORLD");
				System.out.println(num);
				}
	    	catch(NumberFormatException e) 
	    	{
	    		System.out.println("Number Format Execption");
	    	} 
				try {
					int a[]=new int[5];
					a[7]=9;
					}
				catch(Exception e) 
				{
						System.out.println("Handled");
				}
				System.out.println("other statement");
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Handles and recovered");
	    }
	    
	}
}
