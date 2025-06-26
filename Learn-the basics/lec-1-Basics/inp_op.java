import java.util.Scanner;

public class inp_op {
    public static void printNumber(int number) {
        System.out.println("You entered: " + number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int input = sc.nextInt();

        printNumber(input);

        sc.close();
    }
}
