import java.util.HashSet;

// Brute force method
public class removeDuplicate_1 {
    public static void removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 3, 3 };
        removeDuplicates(arr);
    }
}

// timce-complexity -> O(n);
// space complxity -> O(n);