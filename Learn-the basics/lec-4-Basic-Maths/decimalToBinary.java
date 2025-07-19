import java.util.Scanner;

// decimal to binary converter
public class decimalToBinary {
    public static String toBinary(int number) {
        if(number == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.append(number % 2);
            number /= 2;
        }
        return binary.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String binary = toBinary(decimal);
        System.out.println("Binary representation is: "+ binary);
        sc.close();
    }
}


// time complexity -> O(logN);
// space complexity -> O(logN);