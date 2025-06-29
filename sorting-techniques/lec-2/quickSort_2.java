import java.util.Scanner;
class Solution {
    static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;

        while(i < j) {
            while(nums[i] <= pivot && i <= high - 1) {
                i++;
            }
            while(nums[j] > pivot && j >= low + 1){
                j--;
            }
            if(i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }

    static void qs(int[] nums, int low, int high) {
        if(low < high) {
            int pIndex = partition(nums, low, high);
            qs(nums, low, pIndex - 1);
            qs(nums, pIndex + 1, high);
        }
    }

    public static int[] quickSort(int[] nums) {
        qs(nums, 0, nums.length - 1);
        return nums;
    }
}

public class quickSort_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in an array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before quick sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.quickSort(arr);
        System.out.println("After quick sort: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
