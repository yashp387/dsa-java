import java.util.Scanner;

// Reverse array using recursion function
public class reverse_array_2 {
    static void printArray(int arr[], int n) {
        System.out.println("Reversed array is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverseArray(int arr[], int start, int end) {
        if(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements n: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " + n + " numbers");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, n-1);
        printArray(arr, n);
        sc.close();
    }
}
