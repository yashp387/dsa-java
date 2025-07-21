public class FirstUniqueChar {

    public static char findFirstNonRepeatingChar(String s) {
        int[] freq = new int[26]; // for lowercase letters a-z

        // Step 1: Count frequencies
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: Find the first character with freq 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return '-'; 
    }

    public static void main(String[] args) {
        String input = "aabbccddee";
        char result = findFirstNonRepeatingChar(input);

        if (result == '-') {
            System.out.println("All characters repeat.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}

// time complexity -> O(n);
// space complexity -> O(1);