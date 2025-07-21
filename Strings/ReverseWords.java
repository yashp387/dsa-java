public class ReverseWords {
    public static String reverseWords(String sentence) {
        if(sentence == null || sentence.trim().isEmpty()) return "";

        String[] words = sentence.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if(i != 0) reversed.append(" ");
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String sentence = " Java   is fun";
        System.out.println(reverseWords(sentence));
    }
}

// time complexity -> O(n);
// space complexity -> O(n);