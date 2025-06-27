import java.util.Scanner;

public class selectionSort {
    public static void selection_sort(int arr[], int n) {
        for(int i = 0; i <= n-2; i++) {
            int minimum = i;

            for(int j = i; j <= n-1; j++) {
                if(arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Selection sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values in an array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Selection sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr, n);
        sc.close();
    }
}

// time-complexity = O(n^2)