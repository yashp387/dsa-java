
public class CharFrequency {
    public static void main(String[] args) {
        String input = "Hello Feedback!!";

        int[] freq = new int[26]; // for a to z

        input = input.toLowerCase(); // convert to lowercase

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++; // count only letters
            }
        }

        // print the character frequencies
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + " : " + freq[i]);
            }
        }
    }
}

// time complexity -> O(n);
// space complexity -> O(1);