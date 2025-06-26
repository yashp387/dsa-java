import java.util.Scanner;

public class prime_number {
    public static boolean primeNumber(int n) {
        int count = 0;
        for(int i = 1; i*i <= n; i++) {
            if(n % i == 0) {
                count++;
                if(i != n/i) {
                    count++;
                }
            }
        }
        if(count == 2) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        boolean prime_num = primeNumber(n);
        System.out.println(prime_num);
        sc.close();
    }
}
