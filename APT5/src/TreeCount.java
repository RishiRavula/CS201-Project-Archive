
public class TreeCount {
    public class TreeNode {
        int info;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            info = x;
        }
        TreeNode(int x, TreeNode lNode, TreeNode rNode){
            info = x;
            left = lNode;
            right = rNode;
        }
    }
    public int count(TreeNode tree) {
        if (tree == null) {
            return 0;
        }

        int left = count(tree.left);
        int right = count(tree.right);

        return (left + right + 1);
    }
}

