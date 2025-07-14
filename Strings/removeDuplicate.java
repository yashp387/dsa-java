import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicate {
    public static String removeDuplicates(String str) {
        str = str.toLowerCase(); 

        Set<Character> seen = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            seen.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : seen) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String output = removeDuplicates(input);
        System.out.println("String after removing duplicate: " + output);

        sc.close();
    }
}

// Time Complexity -> O(n);
// Space Complexity	-> O(n);