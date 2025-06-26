import java.util.*;

public class count_digit {
    public static int countDigits(int n) {
        int count = 0;
        while(n > 0) {
            count ++;
            n = n / 10;
        }
        return count;
    }

    public static int countDigits2(int n) {
        int count = (int) (Math.log10(n) + 1);
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("The value of n is: " + n);
        int digits = countDigits(n);
        System.out.println("Number of digits in n: " + digits);
        int digits2 = countDigits2(n);
        System.out.println(("Number of digits in second method is: " + digits2));
        sc.close();
    }
}

// Time complexity = O(log10(n))
// Space complexity = O(1)
