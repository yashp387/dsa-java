
// rotate the array by d places
public class rotateArray {
    public static void reverseArray(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void rotate_array(int[] arr, int n, int k) {
        k = k % n;

        // for rotate to left side
        // reverseArray(arr, 0, k - 1);
        // reverseArray(arr, k, n - 1);
        // reverseArray(arr, 0, n - 1);

        // for rotate to right side
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr, 0, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;
        rotate_array(arr, n, k);
        System.out.println("After rotating the k elements to right: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
