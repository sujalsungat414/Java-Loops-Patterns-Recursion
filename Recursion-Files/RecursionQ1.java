//Print 5 to 0 integer numbers
public class RecursionQ1 {
    public static void printNumber(int n) {
        if (n == 0) {
            return; // base case
        }
        System.out.print(n + " ");
        printNumber(n - 1); /// used recursion
    }

    public static void main(String args[]) {
        printNumber(5);
    }
}