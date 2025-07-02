import java.util.Scanner;

public class removeDuplicate_2 {
    static int removeDuplicate(int[] arr, int n) {
        int i = 0;
        for(int j = 0; j < n; j++) {
            if(arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements in an array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = removeDuplicate(arr, n);
        System.out.println("The array after removing duplicates: ");
        for(int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}


// Time Complexity: O(n);
// Space Complexity: O(1);