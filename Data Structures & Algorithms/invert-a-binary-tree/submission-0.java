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
    public TreeNode invertTree(TreeNode root) {
        TreeNode cur = root;
        if(cur!=null){
            traverse(cur);
        }  
        return root;
    }

    private TreeNode traverse(TreeNode cur){
        if(cur.left != null){
            traverse(cur.left);
        }
        if(cur.right != null){
            traverse(cur.right);
        }
        TreeNode temp = cur.left;
        cur.left = cur.right;
        cur.right = temp;
        return null;
    }
}
