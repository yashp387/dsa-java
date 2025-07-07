import java.util.Scanner;

public class recursiveBubbleSort {
    public static void bubble_sort(int[] arr, int n) {
        if(n == 1) return;

        int didSwap = 0;
        for(int j = 0; j <= n - 2; j++) {
            if(arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }
        }
        if(didSwap == 0) return;

        bubble_sort(arr, n - 1);
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
        System.out.println("After bubble sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}


// Time complexity -> O(n^2);
// Space complexity -> O(n);