import java.util.Scanner;

// move zeros to end of and array
public class moveZero {
    public static int[] moveZeros(int[] arr, int n) {
        int j = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }
        // non-zero elements
        if(j == -1) return arr;
        for(int i = j + 1; i < n; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements in the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = moveZeros(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
        sc.close();
    }
}

// time-complexity -> O(n);
// space-complexity -> O(1);