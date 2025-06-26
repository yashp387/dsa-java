import java.util.Scanner;

public class print1ToN_backtracking {
    public static void print1ToN(int i, int n) {
        if(i < 1) return;
        print1ToN(i-1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        print1ToN(n, n);
        sc.close();
    }
}
