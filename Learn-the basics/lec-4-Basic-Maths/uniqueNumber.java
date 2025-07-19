
// find unique if number apppear two times in the array and one number appear once in the array
public class uniqueNumber {
    public static int findUnique(int[] arr) {
        int unique = 0;
        for(int num : arr) {
            unique ^= num;
        }
        return unique;
    }
    
    // find the unique number if number appear three times in the array and one number appear once in the array
    public static int findUnique2(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 7};
        int[] arr2 = {2, 2, 3, 2};
        int unique = findUnique(arr);
        int unique2 = findUnique2(arr2);
        System.out.println("Unique number is: "+ unique);
        System.out.println("Unique number is: "+ unique2);
    }
}

// time complexity -> O(N);
// space complexity -> O(1);