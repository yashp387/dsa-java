import java.util.Scanner;

public class palindromeString {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        boolean rev_str = isPalindrome(str);
        System.out.println(rev_str);
        sc.close();
    }

}

//  Time Complexity: O(n);
//  Space Complexity: O(n);