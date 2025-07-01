import java.util.Scanner;

public class prime_number {
    public static boolean primeNumber(int n) {
        if(n <= 1) return false;
        int sqrt = (int) Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++) {
            if(n % i == 0) {
               return false;
            } 
        }
        return true;
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
