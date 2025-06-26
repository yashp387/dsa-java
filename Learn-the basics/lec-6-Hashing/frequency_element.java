public class frequency_element {
    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxElement = 0, minElement = 0;

        for(int i = 0; i < n; i++) {
            if(visited[i] == true) 
                continue;
            
            int count = 1;
            for(int j = 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if(count > maxFreq) {
                maxElement = arr[i];
                maxFreq = count;
            }
            if(count < minFreq) {
                minElement = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxElement);
        System.out.println("The lowest frequency element is: " + minElement);
    }
     public static void main(String[] args) {
        int arr[] = {10, 5, 10, 15, 10, 15};
        int n = arr.length;
        countFreq(arr, n);
    }
}
