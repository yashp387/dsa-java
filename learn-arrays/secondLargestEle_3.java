import java.util.Scanner;

// optimal solution
public class secondLargestEle_3 {
    public static void secondLargestElement(int[] arr, int n) {
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element of an array is: " + secondLargest);
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
        secondLargestElement(arr, n);
        sc.close();
    }
}

// time-complexity -> O(n);