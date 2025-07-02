import java.util.ArrayList;
import java.util.Arrays;

public class intersection {

    public static int[] intersections(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                // Avoid duplicates in result
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        // Convert result to int[]
        int[] intersection = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            intersection[k] = result.get(k);
        }

        return intersection;
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 2, 3, 4, 5, 6};
        int[] nums2 = { 2, 2, 4, 3, 5, 6, 8, 9};

        int[] result = intersections(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }

}
