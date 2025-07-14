import java.util.Scanner;

public class sortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert string to char array
        char[] chars = input.toCharArray();

        // Sort the char array
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    // Swap
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        // Convert back to string
        String sorted = new String(chars);
        System.out.println("Sorted string: " + sorted);
        sc.close();
    }
}

// time-complexity  -> O(n^2);
// space complexity  -> O(1);
