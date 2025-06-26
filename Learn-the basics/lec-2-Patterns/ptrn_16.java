import java.util.Scanner;

public class ptrn_16 {
    static void pattern16(int n) {
        for(int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for(int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        pattern16(n);
        sc.close();
    }
}
