//Find the number of ways in which you can invite n people to your party, single or in pairs
// n = 4
public class RecursionQ20 {
    public static int callGuests(int n) {

        if (n <= 1) {
            return 1;
        }
        // single
        int way1 = callGuests(n - 1);

        // pairs
        int way2 = (n - 1) * callGuests(n - 2);

        return way1 + way2;

    }

    public static void main(String args[]) {
        int n = 4;
        int ans = callGuests(n);
        System.out.print(ans);
    }
}
