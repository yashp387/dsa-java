public class countFrequencies {
    public static void countFreq(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];
        for(int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(i + " -> " + freq[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 4, 5, 4, 5, 3, 1, 2};
        countFreq(arr);
    }
}
