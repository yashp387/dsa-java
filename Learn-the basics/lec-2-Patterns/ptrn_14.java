import java.util.Scanner;

public class ptrn_14 {
    static void pattern14(int n) {
        for(int i = 0; i < n; i++) {
            for(char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        pattern14(n);
        sc.close();
    }
}
