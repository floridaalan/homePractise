import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>(); // allows only unique elements.

        for (int num : nums1) {
            set1.add(num); // Store unique elements from nums1.
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num); // Only add once, no duplicates.
            }
        }

        // Convert resultSet(dynamic) to int[](fixed-size).
        int[] res = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            res[i++] = num;
        }

        return res;
    }
}
