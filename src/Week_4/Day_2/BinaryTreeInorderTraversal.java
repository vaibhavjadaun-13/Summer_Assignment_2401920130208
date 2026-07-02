import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeInorderTraversal {

    public static void inorder(TreeNode root, List<Integer> ans) {

        if (root == null)
            return;

        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }
}