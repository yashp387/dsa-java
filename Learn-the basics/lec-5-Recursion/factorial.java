import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n == 0) return 1;
        return n*fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
        sc.close();
    }
}
