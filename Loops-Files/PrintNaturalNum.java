import java.util.Scanner;

public class PrintNaturalNum{
    public static void main (String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Natural Number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<= n;i++){
            sum = sum + i ;
        }
        System.out.println(sum);
    }
}