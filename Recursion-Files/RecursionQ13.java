//Remove duplicates in a String
//"abbccda"
public class RecursionQ13 {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicated(String str, int index, String newString) {

        if (index == str.length()) {
            System.out.print(newString);
            return;
        }

        char currentChar = str.charAt(index);
        if (map[currentChar - 'a']) {
            removeDuplicated(str, index + 1, newString);
        } else {
            newString += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicated(str, index + 1, newString);
        }
    }

    public static void main(String args[]) {
        String str = "abbccda";
        removeDuplicated(str, 0, "");
    }
}
