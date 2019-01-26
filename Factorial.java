
public class Factorial {
	
	public int factorial(int n, String type) {
		if (type.equals("iterative")) {
			return factorial_iterative(n);
		} else if (type.equals("recursive")) {
			return factorial_recursive(n);
		} else {
			return -1;
		}
	}
	
	public int factorial_iterative(int n) {
		int factorial = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial *= i;
			
		}
		return factorial;
	}
	
	public int factorial_recursive(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial_recursive(n - 1);
		}
	}
}
