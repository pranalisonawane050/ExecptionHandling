
/*
	class NegativeRadiusException extends Exception{
	    @Override
	    public String toString() {
	        return "Radius cannot be negative!";
	    }

	    @Override
	    public String getMessage() {
	        return "Radius cannot be negative!";
	    }
	}
*/
	public class Trowblock {
		public static void main (String args[]) throws InterruptedException
 { 
			/*
			for(int i=0;i<=10;i++) 
			{
				System.out.println(i);		
				Thread.sleep(1000);//InterruptedException
				}
			 */		
			///Or we can use try catch
				
			for(int i=0;i<=10;i++) 
			{	
				try {
					System.out.println(i);		
					Thread.sleep(1000);//InterruptedException
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
				}
			
			//System.out.println(10/0);
			
			//throw new ArithmeticException("divide by zero");
		
		
	}
	}
	
/*
	    public static double area(int r) throws NegativeRadiusException{
	        if (r<0){
	            throw new NegativeRadiusException();
	        }
	        double result = Math.PI * r * r;
	        return result;
	    }
/*
	    public static int divide(int a, int b) throws ArithmeticException{
	        // Made By Harry
	        int result = a/b;
	        return result;
	    }
	    public static void main(String[] args) {
	        // Shivam - uses divide function created by Harry
	        try{
//	            int c = divide(6, 0);
//	            System.out.println(c);
	            double ar = area(6);
	            System.out.println(ar);
	        }
	        catch(Exception e){
	            System.out.println("Exception");
	        }
	    }
*/

