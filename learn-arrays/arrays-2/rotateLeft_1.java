import java.util.Scanner;

// rotate array to left by one place
public class rotateLeft_1 {
    public static void rotateArray(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println("New rotated array is: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotateArray(arr);
        sc.close();
    }
}
