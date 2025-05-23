public class HalfPyramidNum {
    public static void main(String args[]) {
        // Outer Loop
        for (int i = 0; i < 5; i++) {
            // inner loop
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}

/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */