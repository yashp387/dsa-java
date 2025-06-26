import java.util.Scanner;

public class ptrn_17 {
    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            // characters
            char ch = 'A';
            int breakPoint = (2*i+1) / 2;
            for(int j = 1; j <= 2*i+1; j++) {
                System.out.print(ch);
                if(j <= breakPoint) ch++;
                else ch--;
            }

            // space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        pattern17(n);
        sc.close();
    }
}
