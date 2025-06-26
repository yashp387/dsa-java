import java.util.Scanner;

public class reverse_number {
    public static int reverseNumber(int n) {
        int rev_num = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            rev_num = (rev_num*10) + lastDigit;
            n = n / 10;
        }
        return rev_num;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int revNum = reverseNumber(n);
        System.out.println("Reverse of " + n + " is " + revNum);
        sc.close();
    }
}
