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
    public int maxDepth(TreeNode root) {
        if(root != null){
            return depth(root,0);
        }
        return 0;
    }
    private int depth(TreeNode curr, int counter){
        if(curr == null){
            return counter;
        }
        counter++;
        int check1 = depth(curr.left,counter);
        int check2 = depth(curr.right,counter);
        return Math.max(check1,check2);
    }
}
