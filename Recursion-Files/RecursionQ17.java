//Print all permutations of a String
//"abc"
public class RecursionQ17 {
    public static void printPermutation(String str, String permutation) {

        if (str.length() == 0) { // base level
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // "abc -> ab"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, permutation + currentChar);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        printPermutation(str, "");
    }
}
