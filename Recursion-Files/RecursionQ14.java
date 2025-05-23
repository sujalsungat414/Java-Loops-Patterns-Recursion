//("IMP")Print all the subsequences of a String
//"abc"
public class RecursionQ14 {
    public static void subSequences(String str, int index, String newString) {
        if (index == str.length()) { // base case
            System.out.print(newString + " ");
            return;
        }
        char currentChar = str.charAt(index);

        // to be
        subSequences(str, index + 1, newString + currentChar);
        // or not to be
        subSequences(str, index + 1, newString);
    }

    public static void main(String args[]) {
        String str = "abc";
        subSequences(str, 0, "");
    }
}
