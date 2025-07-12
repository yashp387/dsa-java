
// brute force method
public class upperBound {
    public static int uppder_bound(int[] arr, int n, int x) {
        for(int i = 0; i < n; i++) {
            if(arr[i] > x) {
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = arr.length;
        int x = 16;
        int indx = uppder_bound(arr, n, x);
        System.out.println("The lower bound is at index: "+ indx);
    }
}

// time complexity  -> O(n);
// space complexity -> O(1);