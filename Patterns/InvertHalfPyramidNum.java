public class InvertHalfPyramidNum {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5 - i - 1; j++) {
                System.out.print(j + 1);
            }

            /*
             * Secondary Method
             * ->declare and initialize int k with 1 value in outer loop
             * int k = 1;
             * 
             * for(int j = 5; j > i; j--){
             * System.out.print(k);
             * k+=1;
             * }
             * 
             * System.out.println(); //for new line in outer loop
             */
            System.out.println();
        }
    }
}

/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */