package exception;

 public class Exceptional {
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 0;  // This will cause an exception
	        int result;

	        try {
	            result = a / b;  // May throw ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: Division by zero is not allowed.");
	        } finally {
	            System.out.println("This block always executes.");
	        }

	        System.out.println("Program continues...");
	    }
	}


