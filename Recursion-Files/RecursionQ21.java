//Print all the subsets of a set of first n natural numbers
//n = 3 (1,2,3)

import java.util.ArrayList;

public class RecursionQ21 {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        findSubset(n - 1, subset);

        // add nhi hoga
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String args[]) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
