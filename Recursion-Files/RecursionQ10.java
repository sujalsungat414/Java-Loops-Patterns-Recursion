//Find the 1st & last occurrence of an element in string 
//"abaacdaefaah"
public class RecursionQ10 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurrence(String str, int index, char element) {
        if (index == str.length()) { // Base case
            System.out.println("First char at index: " + first);
            System.out.println("Last char at index: " + last);
            return;
        }

        char currentChar = str.charAt(index);
        if (currentChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurrence(str, index + 1, element); // Recursion
    }

    public static void main(String args[]) {
        String str = "abaacdaefaah";

        findOccurrence(str, 0, 'a'); // function call
    }

}
