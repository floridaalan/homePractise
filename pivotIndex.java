class Solution {
    public int pivotIndex(int[] nums) {
        int tot = 0;
        int left = 0;
        // sum of all numbers
        for (int ele : nums) {
            tot += ele;
        }
        // check for pivot index from left to right
        for (int i = 0; i < nums.length; i++) {
            if (left == tot - left - nums[i]) {
                return i;
            }
            left += nums[i];
        }
        // no pivot index found
        return -1;
    }
}
