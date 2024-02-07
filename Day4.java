// Fibonacci sequence

public class Day4
{
    public static void main(String[] args) {
        int n = 10;
        FibonacciSeries(n);
    }

    // For printing sequence of Fibonacci
    static void FibonacciSeries(int n){
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int n3;
        for (int i = 2; i <= n; i++) {               // Time complexity : O(n)
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
    }

    // For printing a particular fibonacci number with time complexity of (golden ratio)^n

    static int Fibonacci(int n){
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
}
