public class HeightLabel {
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
    public TreeNode rewire(TreeNode t) {
        if (t == null) return null;
        return new TreeNode(height(t),
                rewire(t.left),
                rewire(t.right));
    }

    private int height(TreeNode t) {
        if  (t == null) return 0;
        return 1 + Math.max(height(t.left),
                height(t.right));
    }

}

