import java.util.Scanner;

public class character_hashing {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();

        // pre-compute
        /*  here we take hash size 26 because we only want lowercase character and if we want like uppercase and all then we take size is 256 and does not minus that 'a' fron hash array */
        int hash [] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        System.out.println("Enter no. of characters: ");
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            System.out.println("Enter a character " + i + " : ");
            char ch;
            ch = sc.next().charAt(0);

            // fetching
            System.out.println(ch + " occurs " + hash[ch - 'a'] + " times ");
        }
        sc.close();
    }
}
