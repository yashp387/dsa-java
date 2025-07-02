public class findMaxConsecutive {
    public static int maxConsecutiveOnes(int[] arr) {
        int n = arr.length;
        int maximum = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                count++;
                maximum = Math.max(maximum, count);
            } else {
                count = 0;
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0 , 2, 3, 1, 1, 1, 0 , 0};
        int ans = maxConsecutiveOnes(arr);
        System.out.println(ans);
    }
}
