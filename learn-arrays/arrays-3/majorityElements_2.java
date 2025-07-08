import java.util.HashMap;
import java.util.Map;

// Better solution
public class majorityElements_2 {
    public static int majorityEle(int[] arr) {
        int n = arr.length;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        // searching the majority element
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if(it.getValue() > (n / 2)) {
                return it.getKey();
            }
         }
         return -1;
    }
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityEle(arr);
        System.out.println("The majority element is: " + ans);

    }
}

// time complexity ->  O(N*logN) + O(N)
// space complexity -> O(N);