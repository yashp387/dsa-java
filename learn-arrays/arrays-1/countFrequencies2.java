import java.util.*;

// print frequencies in sorted order
public class countFrequencies2 {
    public static void countFreqSorted(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer,Integer>> freqList = new ArrayList<>(freqMap.entrySet());
        freqList.sort((a, b) -> a.getValue() - b.getValue());

        System.out.println("Frequencies sorted by count: ");
        for(Map.Entry<Integer, Integer> entry : freqList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4, 5, 3, 1, 3, 2, 4};
        countFreqSorted(arr);
    }
}
