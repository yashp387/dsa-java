import java.util.Scanner;

public class secondSmallest {
    public static void secondSmallestEle(int[] arr, int n) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second smallest element of an array is: " + secondSmallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements in an array: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        secondSmallestEle(arr, n);
        sc.close();
    }
}
