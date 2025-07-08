// brute force solution
public class getLongestSubarray {
    public static int longestSubarray(int[] arr, long k) {
        int n = arr.length;
        int length = 0;
        for(int i = 0; i < n; i++) {
            long sum = 0;
            for(int j = i; j < n; j++) {
                sum += arr[j];
                if(sum == k) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;
        int len = longestSubarray(arr, k);
        System.out.println("The length of longest sub array is: " + len);
    }
}

// time complxity -> O(n^2);
// space complexity -> O(1);