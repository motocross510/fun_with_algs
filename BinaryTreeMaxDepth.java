/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int maxDepth = 0;
    
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        bfs(root, 1);
        return maxDepth;
    }

    private void bfs(TreeNode node, int depth) {
        if (node != null) {
            if (maxDepth < depth) maxDepth = depth;
            depth++;
            bfs(node.left,  depth);
            bfs(node.right, depth);
        }
    }
}
