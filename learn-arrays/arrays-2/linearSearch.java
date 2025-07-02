
public class linearSearch {
    public static int linear_search(int[] arr, int element) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 2, 4};
        int element = 2;
        int ans = linear_search(arr, element);
        System.out.println("Element found at " + ans + " index");
    }
}
