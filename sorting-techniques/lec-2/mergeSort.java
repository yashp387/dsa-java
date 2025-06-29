import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    private static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // sorting the elements in temp array 
        while (left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements of left half are still left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements of right half are still left
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // for trasfering all the elements from temp to arr
        for(int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void merge_sort(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = (low + high) / 2;
        merge_sort(arr, low, mid);   // left half
        merge_sort(arr, mid + 1, high);  // right half
        merge(arr, low, mid, high);    // merging the both halves
    }
}

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements in an array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before merger sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.merge_sort(arr, 0, n - 1);
        System.out.println("After merge sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();;
    }
}


// time complexity -> O(nlogn);   // in all cases
// space complexity -> O(n);    