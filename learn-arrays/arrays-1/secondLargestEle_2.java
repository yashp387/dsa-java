import java.util.Scanner;

public class secondLargestEle_2 {
    public static void secondLargest(int[] arr, int n) {
        int largest = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        int sLargest = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
        }
        System.out.println("Second largest element is: " + sLargest);
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
        secondLargest(arr, n);
        sc.close();
    }
}

// time complexity = O(2n);