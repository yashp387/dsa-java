import java.util.Scanner;

// optimal solution 
public class largestElement_2 {
    public static void largestEle(int arr[], int n) {
        int largest = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest element of an array is: " + largest);
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
        largestEle(arr, n);
        sc.close();
    }
}

// time-conmplexity = O(n);