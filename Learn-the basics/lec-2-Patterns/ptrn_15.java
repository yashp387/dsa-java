import java.util.Scanner;

public class ptrn_15 {
    static void pattern15(int n) {
        for(int i = 0; i < n; i++) {
            for(char ch = 'A'; ch <= 'A' + (n-i-1); ch++) {
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        pattern15(n);
        sc.close();
    }
}
