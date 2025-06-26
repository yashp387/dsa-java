import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Reverse array using library function
public class reverseArray3 {
    static void printArray(Integer arr[], int n) {
        System.out.println("Reversed array is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(Integer arr[]) {
        Collections.reverse(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element n: ");
        int n = sc.nextInt();
        Integer [] arr = new Integer[n];
        System.out.println("Enter " + n + " numbers");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        printArray(arr, n);
        sc.close();
    }
}
