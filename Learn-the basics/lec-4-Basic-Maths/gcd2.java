import java.util.Scanner;

public class gcd2 {
    public static int gcd_hcf(int n1, int n2) {
        while(n1 > 0 && n2 > 0) {
            if(n1 > n2) n1 = n1 % n2;
            else n2 = n2 % n1;
        }
        if(n1 == 0) return n2;
        else return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n1 and n2: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = gcd_hcf(n1, n2);
        System.out.println("GCD of: " + n1 + " and " + n2 + " is " + gcd);
        sc.close();
    }
}
