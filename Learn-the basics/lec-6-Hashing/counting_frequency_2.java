import java.util.*;

public class counting_frequency_2 {
   public static void main(String[] args) {
        int arr[] = {10, 5, 10, 5, 10, 15};
        int n = arr.length;
        frequency(arr, n);
   }

    static void frequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> it: map.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }
   }
}