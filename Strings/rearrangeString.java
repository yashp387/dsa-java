import java.util.PriorityQueue;
import java.util.Scanner;

public class rearrangeString {
    public static String rearrange(String str) {
        int n = str.length();
        int[] freq = new int[26];

        for(char c : str.toCharArray()) {
            freq[c - 'a']++;
            if(freq[c - 'a'] > (n + 1) / 2) return "0";
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) {
                pq.offer(new int[] {i, freq[i]});
            }
        }

        StringBuilder result = new StringBuilder();
        int[] prev = {-1, 0};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            result.append((char) (curr[0] + 'a'));
            curr[1]--;

            if(prev[1] > 0) pq.offer(prev);
            prev = curr;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        String output = rearrange(input);

        if (output.equals("0")) {
            System.out.println("No valid rearrangement possible.");
        } else {
            System.out.println("Rearranged string: " + output);
        }
        sc.close();
    }
}

// time complexity -> O(n log k) where n = string length, k = number of unique characters;
// space complexity -> O(n);