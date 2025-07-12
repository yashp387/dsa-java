public class upperBound2 {
    public static int uppder_bound(int[] arr, int target, int n) {
        int low = 0, high = n - 1;
        int ans = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = arr.length;
        int target = 17;
        int indx = uppder_bound(arr, target, n);
        System.out.println("The lower bound is at index: "+ indx);
    }
}

// time complexity -> O(logn);
// space complexity -< O(1);