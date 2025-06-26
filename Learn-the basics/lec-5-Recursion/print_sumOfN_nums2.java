public class print_sumOfN_nums2 {

    // parameterised way of cal. sum of n numbers
    public static void sum(int i, int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        sum(i-1, sum+i);
    }
    public static void main(String[] args) {
        int n = 3;
        sum(n, 0);
    }
}
