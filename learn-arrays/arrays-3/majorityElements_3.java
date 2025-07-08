
// optimal solution uses Moore’s Voting Algorithm:
public class majorityElements_3 {
    public static int majorityEle(int[] arr) {
        int n = arr.length;
        int count = 0;
        int element = 0;
        for(int i = 0; i < n; i++) {
            if(count == 0) {
                count = 1;
                element = arr[i];
            } else if(element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        // check if the stored element is the majority element
        int count1 = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == element) {
                count1++;
            } 
        }
        if(count1 > (n / 2)) return element;
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityEle(arr);
        System.out.println("The majority element is: " + ans);

    }
}

// time complexity -> O(n) + O(n);
// Reason: The first O(N) is to calculate the count and find the expected majority element. The second one is to check if the expected element is the majority one or not.

// Note: If the question states that the array must contain a majority element, in that case, we do not need the second check. Then the time complexity will boil down to O(N).

// space complexity -> O(1);