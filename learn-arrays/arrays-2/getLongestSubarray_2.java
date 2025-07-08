import java.util.HashMap;
import java.util.Map;

// better solution
public class getLongestSubarray_2 {
    public static int longestSubarray(int[] arr, long k) {
        int n = arr.length;
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLength = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            long remainingSum = sum - k;

            if(preSumMap.containsKey(remainingSum)) {
                int length = i - preSumMap.get(remainingSum);
                maxLength = Math.max(maxLength, length);
            }

            if(!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        long k = 10;
        int len = longestSubarray(arr, k);
        System.out.println("The length of the longest sub array is: " + len);
    }
}

// time complexity -> O(n) for unorderd map
// time complexity -> O(nlogn) for orderd map
// space complexity -> O(n);