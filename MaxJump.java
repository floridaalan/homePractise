public class Solution {
    public boolean canJump(int[] nums) {
        int maxReach=0; // Farthest index we can reach so far
        for (int i=0;i<nums.length;i++) {
            if (i>maxReach) {
                // If current index is not reachable
                return false;
            }
            maxReach=Math.max(maxReach,i+nums[i]); // Update the farthest we can go
        }

        return true;
    }
}
