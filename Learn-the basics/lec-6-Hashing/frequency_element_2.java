import java.util.*;

public class frequency_element_2 {
    public static void countFreq(int arr[], int n) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++) {
            if(mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = n;
        int maxElement = 0, minElement = 0;

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if(count > maxFreq) {
                maxElement = element;
                maxFreq = count;
            }
            if(count < minFreq) {
                minElement = element;
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 15, 10, 10, 15};
        int n = arr.length;
        countFreq(arr, n);
    }
}
