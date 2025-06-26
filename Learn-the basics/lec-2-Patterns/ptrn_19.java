import java.util.Scanner;

public class ptrn_19 {
    static void pattern19(int n) {
        int initial_spaces = 0;
        for(int i = 0; i < n; i++) {
            // stars
            for(int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j <= initial_spaces; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            initial_spaces += 2;
            System.out.println();
        }
        initial_spaces = 2*n - 2;
        for(int i = 1; i <= n; i++) {
             // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j <= initial_spaces; j++) {
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            initial_spaces -= 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        pattern19(n);
        sc.close();
    }
}
