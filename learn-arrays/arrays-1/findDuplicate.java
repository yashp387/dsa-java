import java.util.HashSet;

public class findDuplicate {
    public static int findDup(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(set.contains(arr[i])) {
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate number is: " + findDup(arr));
    }
}
