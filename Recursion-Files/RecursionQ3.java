//print sum of first n natural numbers
public class RecursionQ3 {
    public static void sumNaturalNum(int start, int n, int sum) {
        if (start == n + 1) { // base level
            System.out.print("Sum is : " + sum);
            return;
        }
        sum += start;
        sumNaturalNum(start + 1, n, sum);

    }

    public static void main(String args[]) {
        sumNaturalNum(1, 10, 0);
    }
}
