import java.util.ArrayList;
import java.util.HashSet;

public class union1 {
    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }
        for (int it : set) {
            union.add(it);
        }
        return union;
    }

    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ") ;
    }
}

// Time Complexity = O(n + m);
// Space Complexity = O(n + m);