
// optimal solution
public class getLongestSubarray_3 {
    public static int longestSubarray(int[] arr, long k) {
        int n = arr.length;
        int left = 0, right = 0;
        long sum = arr[0];
        int maxLength = 0;
        while(right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if(sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right ++;
            if(right < n) sum += arr[right];
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 3, 3};
        long k = 6;
        int len = longestSubarray(arr, k);
        System.out.println("The length of the longest sub array is: " + len);
    }
}

// time complexity -> O(2*n);
// space complexity -> O(1);