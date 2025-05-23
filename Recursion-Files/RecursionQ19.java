//Place Tiles of size 1xm in a floor of size nxm
//n = 4, m = 2
public class RecursionQ19 {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        // vertically
        int verticalPlacements = placeTiles(n - m, m);

        int horizontalPlacements = placeTiles(n - 1, m);

        return verticalPlacements + horizontalPlacements;
    }

    public static void main(String args[]) {
        int n = 4, m = 2;
        System.out.print(placeTiles(n, m));

    }
}
