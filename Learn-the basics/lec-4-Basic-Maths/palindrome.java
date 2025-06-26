import java.util.Scanner;

public class palindrome {
    public static int palindromeNum(int n) {
        int duplicate = n;
        int rev_num = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            rev_num = (rev_num * 10) + lastDigit;
            n = n / 10;
        }
        if(rev_num == duplicate) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
        return rev_num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        palindromeNum(n);
        sc.close();
    }
}
