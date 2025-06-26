import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class number_hashing_2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int n = sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter " + n + " numbers in an array: ");
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    // pre-compute
    HashMap<Integer, Integer> mp = new HashMap<>();
    for(int i = 0; i < n; i++) {
        int key = arr[i];
        int freq = 0;
        if(mp.containsKey(key)) freq = mp.get(key);
        freq++;
        mp.put(key, freq);
    }

    // Iterate over the hashmao:
    for(Map.Entry<Integer, Integer> it : mp.entrySet()) {
        System.out.println(it.getKey() + "->" + it.getValue());
    }

    System.out.println("Enter no. of queries: ");
    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
        System.out.println("Enter value of query " + i + ":");
        int number = sc.nextInt();

        // fetching
        if(mp.containsKey(number)) System.out.println(number + " occurs " + mp.get(number) + " times");
        else System.out.println(0);
    }
    sc.close();
}
}
