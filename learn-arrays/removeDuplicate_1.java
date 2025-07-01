import java.util.HashSet;

// Brute force method
public class removeDuplicate_1 {
    public static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int index = 0;
        for(int x: set) {
            arr[index] = x;
            index++;
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicates: ");
        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


// timce-complexity -> O(nlogn)+O(n);
// space complxity -> O(n);