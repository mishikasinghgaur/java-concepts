package leetcode;

public class MirrorImage {
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is symmetric.
        }
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true; // Both subtrees are empty, so they are symmetric.
        }
        if (left == null || right == null) {
            return false; // One subtree is empty while the other is not, so they are not symmetric.
        }
        if (left.val != right.val) {
            return false; // Values of the nodes in the subtrees don't match, so they are not symmetric.
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
    public static void main (String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        boolean result1 = isSymmetric(root1);
        System.out.println(result1); // Output: true
    }
}
