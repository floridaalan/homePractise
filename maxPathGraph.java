/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxSum=Integer.MIN_VALUE;//it will calculate the maximum sum from different paths
    public int maxPathSum(TreeNode root) {
        int ans=maxPath(root);
        return Math.max(maxSum,ans);
    }
    public int maxPath(TreeNode root)
    {
        //base condition
        if(root==null)
        {
            return 0;
        }
        int left_sum=Math.max(0,maxPath(root.left));
        int right_sum=Math.max(0,maxPath(root.right));
        int self_sum=left_sum+right_sum+root.val;
        maxSum=Math.max(maxSum,self_sum);
        return Math.max(left_sum,right_sum)+root.val;
}
}
