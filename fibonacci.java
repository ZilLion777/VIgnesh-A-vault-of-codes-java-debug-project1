package vignesh;

public class fibonacci {
    public static int fibonacci(int n) {
        if (n <= 0)
            return 0;
        else if(n==1)
        	return 1;
        else
        	return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }
}
