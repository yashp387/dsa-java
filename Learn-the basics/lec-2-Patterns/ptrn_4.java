import java.util.Scanner;

public class ptrn_4 {
    static void pattern4(int n) {
            for(int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+ " ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        pattern4(n);
        sc.close();
    }
}
