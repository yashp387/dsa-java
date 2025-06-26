import java.util.Scanner;

public class numer_hashing {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter " + n + " number in an array ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // pre-compute
        int hash [] = new int[13];
        for(int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("Enter no. of queries: ");
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            System.out.println("Enter value of query " + i + " : ");
            int number = sc.nextInt();

            // fetching
            System.out.println(number + " occurs " + hash[number] + " times");
        }
        sc.close();
    }
}
