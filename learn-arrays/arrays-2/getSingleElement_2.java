import java.util.Scanner;

public class getSingleElement_2 {
    public static int getSingleEle(int[] arr) {
        int n = arr.length;
        int xor = 0;
        for(int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = getSingleEle(arr);
        System.out.println("The single element is: "+ ans);
        sc.close();
    }
}

// time-complexity  -> O(n);
// space complexity  -> O(1);