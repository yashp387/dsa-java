import java.util.Scanner;

public class ptrn_18 {
    static void pattern18(int n) {
        for(int i = 0; i < n; i++) {
            for(char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        pattern18(n);
        sc.close();
    }
}
