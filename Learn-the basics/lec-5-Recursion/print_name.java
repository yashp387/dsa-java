import java.util.Scanner;

public class print_name {
    public static void print_name_ntimes(int i, int n) {
        if(i > n) return;
        System.out.println("Yash");
        print_name_ntimes(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value on n: ");
        int n = sc.nextInt();
        print_name_ntimes(1,n);
        sc.close();
    }
}

// time coplexity = O(n)
// space complexity = O(n)