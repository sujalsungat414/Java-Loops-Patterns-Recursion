public class FibonacciSeries {
    public static void main(String args[]) {
        int n = 10; // no of terms
        int term1 = 0;
        int term2 = 1;
        int term3 = term1 + term2;
        System.out.print("Fibonacci Series: " + term1);
        System.out.print(" " + term2);
        for (int i = 2; i < n; i++) {
            term3 = term1 + term2;
            term1 = term2;
            term2 = term3;
            System.out.print(" " + term3);
        }
    }
}
