
public class TwoSum {
    public static String twoSum(int n, int[] arr, int target) {
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    return "Yes, indices: " + i + " and " + j;
                }
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println(ans);
    }
}

// Time Complexity (TC): O(n^2);
// Space Complexity (SC): O(1);