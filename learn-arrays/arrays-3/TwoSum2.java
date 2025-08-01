import java.util.HashMap;

public class TwoSum2 {
    public static String twoSum(int n, int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if(map.containsKey(moreNeeded)) {
                int j = map.get(moreNeeded);
                return "Yes, indices: " + j + " and " + i;
            }
            map.put(arr[i], i);
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

// Time-complexity -> O(N);
// space-complexity -> O(N);
