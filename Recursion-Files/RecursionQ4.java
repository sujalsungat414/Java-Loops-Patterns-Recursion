//Print Factorial of a number n
public class RecursionQ4 {
    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int factNum1 = printFactorial(n - 1);
        int fact = n * factNum1;
        return fact;
    }

    public static void main(String args[]) {
        System.out.print(printFactorial(5));
    }
}
