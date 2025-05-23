//Print a String in reverse
public class RecursionQ9 {
    public static void printRevString(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRevString(str, index - 1);
    }

    public static void main(String args[]) {
        String name = "sujal";

        printRevString(name, name.length() - 1);
    }
}
