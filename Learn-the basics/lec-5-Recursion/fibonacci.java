import java.util.Scanner;

public class fibonacci {
    static int fibonacci_series(int n) {
        if(n <= 1) return n;
        int last = fibonacci_series(n -1);
        int secondLast = fibonacci_series(n - 2);
        return last + secondLast;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int result = fibonacci_series(n);
        System.out.println("The fibonacci value of " + n + " is " + result);
        sc.close();
    }
}
