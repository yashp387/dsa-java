import java.util.Scanner;

public class palindromeString_2 {
    static boolean checkPalindrome(int i, String s) {
        if(i >= s.length() / 2) return true;
        if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        return checkPalindrome(i + 1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(checkPalindrome(0, s));
        sc.close();
    }
}
