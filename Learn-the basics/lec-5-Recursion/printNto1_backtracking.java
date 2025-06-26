import java.util.Scanner;

public class printNto1_backtracking {
    public static void printNTo1(int i, int n){
        if(i > n) return;
        printNTo1(i + 1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        printNTo1(1, n);
        sc.close();
    }
}
