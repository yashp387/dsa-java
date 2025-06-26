import java.util.Scanner;

public class ptrn_13 {
    static void pattern13(int n) {
        int num = 1;
        for(int i = 1; i <= n; i ++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        pattern13(n);
        sc.close();
    }
}

