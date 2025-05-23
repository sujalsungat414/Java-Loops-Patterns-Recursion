
//Print all the unique subsequences of a String
//"aaa"
import java.util.HashSet;

public class RecursionQ15 {
    public static void printSubseq(String str, int index, String res, HashSet<String> allSubseq) {
        if (index == str.length()) { // base case
            if (allSubseq.contains(res)) {
                return;
            }

            allSubseq.add(res);
            System.out.println(res);
            return;
        }
        // choose
        printSubseq(str, index + 1, res + str.charAt(index), allSubseq);

        // don't choose
        printSubseq(str, index + 1, res, allSubseq);

    }

    public static void main(String args[]) {
        String str2 = "aaa";
        HashSet<String> allSubseq = new HashSet<>();
        printSubseq(str2, 0, "", allSubseq);

    }
}
