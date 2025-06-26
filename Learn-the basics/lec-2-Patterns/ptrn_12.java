import java.util.Scanner;

public class ptrn_12 {
    static void pattern12(int n) {
        int spaces = 2*(n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // numbers
            for(int j = i; j >= 1; j--) { 
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        pattern12(n);
        sc.close();
    }
}
