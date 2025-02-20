package week1.day3;

public class FibonacciSeries {
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
		}

	public static void main(String[] args) {
		//print Fibonacci Series using Recursive approach
		int n = 8;
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + "");
			
		}
		
	}
}