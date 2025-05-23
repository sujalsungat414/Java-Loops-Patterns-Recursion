//Print 0 to 5 integers numbers
public class RecursionQ2 {
    public static void printNumber(int n) {
        if (n == 6) {
            return;
        }
        System.out.print(n + " ");
        printNumber(n + 1);
    }

    public static void main(String args[]) {
        printNumber(1);
    }

}
