public class ReverseNumber {
    public int reverseNumber(int n) {
        int reverseNumber = 0; // store the result
        while (n != 0) {
            int digit = n % 10;
            reverseNumber = reverseNumber * 10 + digit;
            n = n / 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        ReverseNumber rev = new ReverseNumber();
        System.out.println(rev.reverseNumber(352));

    }
}
