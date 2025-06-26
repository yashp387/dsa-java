import java.util.Scanner;

public class ptrn_7 {
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // start
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        pattern7(n);
        sc.close();
    }
}
