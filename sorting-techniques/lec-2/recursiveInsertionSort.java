import java.util.Scanner;

public class recursiveInsertionSort {
    public static void insertion_sort(int[] arr, int n, int i) {
        if(i == n) return;

        int j = i;
        while(j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertion_sort(arr, n, i + 1);
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
            System.out.println("Before insertion sort: ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            insertion_sort(arr, n, 0);
            System.out.println("After insertion sort: ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            sc.close(); 
    }
}
