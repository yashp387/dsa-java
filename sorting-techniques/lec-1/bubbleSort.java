import java.util.Scanner;

public class bubbleSort {
    static void bubble_sort(int arr[], int n) {
        for(int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0) {
                break;
            }
            // System.out.println("runs");
        }
        System.out.println("After bubble sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements in an array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before bubble sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, n);
        sc.close();
    }
}

// time-complexity = O(n^2)   -> worst case and avg case
// time-complexity = O(n)  -> best case
// Space Complexity: O(1);  