
public class Fibonacci {
	
	public static int fibonacci(int n, String type) {
		if (type.equals("iterative")) {
			return fibonacci_iterative(n);
		} else if (type.equals("recursive")) {
			return fibonacci_recursive(n);
		} else {
			return -1;
		}
	}
	
	private static int fibonacci_iterative(int n) {
		if (n == 0 || n == 1 || n == 2) {
			return 1;
		}
		
		int fib1 = 1, fib2 = 1, fib3 = 1;
		
		for (int i = 3; i <= n; i++) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
		return fib3;
	}
	
	private static int fibonacci_recursive(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
		}
	}
}
