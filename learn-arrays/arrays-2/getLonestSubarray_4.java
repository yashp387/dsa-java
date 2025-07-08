
// this is for positive and negative both values in the array

import java.util.HashMap;
import java.util.Map;

public class getLonestSubarray_4 {
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            int remainingSum = sum - k;

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
        int[] arr = {-1, 1, 1};
        int k = 1;
        int length = longestSubarray(arr, k);
        System.out.println("The legth of the longest subarray is: " + length);
    }
}

// time complexity -> O(n) for unorderd map
// time complexity -> O(nlogn) for orderd map
// space complexity -> O(n);