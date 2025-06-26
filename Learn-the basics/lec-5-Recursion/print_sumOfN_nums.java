import java.util.Scanner;

// functional way of cal.sum of n numbers
public class print_sumOfN_nums {
    public static int sum(int n) {
        if(n == 0) return 0;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Sum of first " + n + " numbers is: " +  result);
        sc.close();
    }
}
