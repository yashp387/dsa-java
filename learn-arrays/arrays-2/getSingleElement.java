import java.util.Scanner;

public class getSingleElement {
    public static int getSingleEle(int[] arr) {
        int n = arr.length;
         
        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[j] == num) {
                    count++;
                }
            }
            if(count == 1) return num;
        }
        // this line never execute
        // if the array contains a single element
        return -1;
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

// time complexity -> O(n^2);
// space complexity -> O(1);