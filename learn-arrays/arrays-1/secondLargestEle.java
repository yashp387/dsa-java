import java.util.Scanner;

// brute force method
public class secondLargestEle {
    public static void secondLargest_element(int[] arr, int n) {
        for(int i = n - 1; i >= 0; i--) {
            for(int j = 0; j <= i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int secondLargest = 0;
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] != arr[n-1]){
                 secondLargest = arr[i];
                 break;
            }
        }
        System.out.println("Second largest element of an array is: " + secondLargest);
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
        secondLargest_element(arr, n);
        sc.close();
    }
}
