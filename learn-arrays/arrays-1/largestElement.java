
// brute force method

import java.util.Scanner;

public class largestElement {
    public static int largestEle(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int minimum = i;

            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
        return arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " values in an array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = largestEle(arr);
        System.out.println("Largest element in array is: " + result);
        sc.close();
    }
}


// time complexity  -> O(nlogn)