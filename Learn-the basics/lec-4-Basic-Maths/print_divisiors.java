import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class print_divisiors {
    public static ArrayList<Integer> printDivisiors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtn = (int) Math.sqrt(n);
        for(int i = 1; i <= sqrtn; i++) {
            if(n % i == 0) {
                divisors.add(i);
                if(i != n/i){
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        ArrayList<Integer> divisors = printDivisiors(n);
        System.out.println("Divisors of " + n + " are: ");
        for(int divisor: divisors) {
            System.out.print(divisor + " ");
        }
        sc.close();
    }
}
