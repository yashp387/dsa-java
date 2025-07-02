public class missingNumber {
    public static void missingNum(int[] arr) {
        int n = arr.length;
        int sum = (n*(n+1)) / 2;
        int s2 = 0;
        for(int i = 0; i < n ; i++) {
            s2 += arr[i];
        }
        int missingNumber = sum - s2;
        System.out.println("Missing number in the array is: " + missingNumber);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        missingNum(arr);
    }
}

// time-complexity  -> O(n);
// space complexity  -> O(1);