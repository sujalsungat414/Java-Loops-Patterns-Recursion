//Move all 'x' to the end of the string
//"axbcxxd"
public class RecursionQ12 {
    public static void moveAllX(String str, int index, int count, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.print(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == 'x') {
            count++;
            moveAllX(str, index + 1, count, newString);
        } else {
            newString += currentChar; // newString = newString + currentChar
            moveAllX(str, index + 1, count, newString);
        }

    }

    public static void main(String args[]) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}