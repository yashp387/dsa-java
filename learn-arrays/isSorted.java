import java.util.Scanner;

public class isSorted {
    public static boolean check(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements in an array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = check(n, arr);
        System.out.println(result);
        sc.close();
    }
}
