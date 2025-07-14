import java.util.Scanner;

public class armstrong_number {
    public static int armstrongNum(int n) {
        int duplicate = n;
        int digits = String.valueOf(n).length();
        System.out.println(digits);
        int sum = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sum = (int) (sum + Math.pow(lastDigit, digits));
            n = n / 10;
        }
        if(sum ==  duplicate) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        armstrongNum(n);
        sc.close();
    }
}

// Time Complexity → O(log n);
// space complexity -> O(1);