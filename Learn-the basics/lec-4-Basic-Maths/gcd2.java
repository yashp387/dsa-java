import java.util.Scanner;

public class gcd2 {
    public static int gcd_hcf(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) a = a % b;
            else b = b % a;
        }
        if(a == 0) return b;
        else return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd_hcf(a, b);
        System.out.println("GCD of: " + a + " and " + b + " is " + gcd);
        sc.close();
    }
}

// time complexity -> O(log(min(a, b)));
// space complexity -> O(1);