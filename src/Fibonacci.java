/**
 * Fibonacci.java class uses the recursive method to locate
 * a specified Fibonacci term that is entered by the user.
 * @author RMGilmour
 * @version 1
 * @date 05/19/2024
 *
 */

public class Fibonacci {
	
	/**
	 * 
	 * @param N	 int parameter to hold the specified term entered by the user
	 * @return	 returns the Fibonacci number
	 */

	static int Fibonacci(int N) {
		
		if (N == 0)
			return 0;
		else if (N == 1 || N == 2)
			return 1;
		return Fibonacci(N - 1) + Fibonacci(N - 2);
		}
	
	/**
	 * 
	 * @param args no args parameter 
	 */

	public static void main(String[] args) {
		
		int N = 10;

		System.out.println(Fibonacci(N-1));
		System.out.println("The " + N + "th term of the Fibonacci sequence is: " + Fibonacci(N-1));
		
	}

}
