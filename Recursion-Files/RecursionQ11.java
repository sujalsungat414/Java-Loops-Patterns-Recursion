//Check if an array is sorted (Strictly Increasing)
//{1,2,3,4,5}
public class RecursionQ11 {
    public static boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1) { // base case
            return true;
        }

        if (arr[index] < arr[index + 1]) {
            // array is sorted till now
            return isSorted(arr, index + 1);
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.print(isSorted(arr, 0));
    }
}
