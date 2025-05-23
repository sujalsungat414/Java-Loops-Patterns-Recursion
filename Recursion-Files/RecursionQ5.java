//Print the Fibonacci sequence til nth term*
public class RecursionQ5 {
    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b, c, n - 1);
    }

    public static void main(String args[]) {
        int a = 0, b = 1;
        int n = 10; // terms
        System.out.print("Fibonacci series: " + a + " " + b + " ");
        fibonacci(a, b, n - 2);
    }
}