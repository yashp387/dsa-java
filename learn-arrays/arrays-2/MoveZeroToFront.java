import java.util.Scanner;

public class MoveZeroToFront {
    public static int[] moveZerosToFront(int[] arr, int n) {
        int j = n - 1; // points to where the next non-zero should go (from end)

        // Traverse array from end
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j--;
            }
        }

        // Fill the rest with 0s
        while (j >= 0) {
            arr[j] = 0;
            j--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = moveZerosToFront(arr, n);
        System.out.println("Array after moving zeros to front:");
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}

// time-complexity -> O(n);
// space-complexity -> O(1);