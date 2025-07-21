
// maintain the order of words in sentence but only reverse that word in senetence
public class ReverseWords2 {
    public static String reverseWords(String senetence)  {
        if(senetence == null || senetence.trim().isEmpty()) return "";

        String[] words = senetence.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            reversed.append(word.reverse()).append(" ");
        }
        return reversed.toString().trim();
    }
    public static void main(String[] args) {
        String sentence = "  Java   is fun    ";
        System.out.println(reverseWords(sentence));
    }
}

// time complexity: O(n);
// space complexity: O(n);