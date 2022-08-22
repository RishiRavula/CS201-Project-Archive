
public class TreeBuilder {
    public TreeNode create(int[] values) {
        TreeNode root = null;
        if(values.length > 0) {
            root = new TreeNode(values[0], null, null);
        }else{
            return null;
        }
        traverse(root, values, 0);
        return root;
    }

    public void traverse(TreeNode root, int[] values, int index) {
        if(2*index+1 < values.length) {
            root.left = new TreeNode(values[2*index+1],null,null);
            traverse(root.left, values, 2*index+1);
        }
        if(2*index+2 < values.length) {
            root.right = new TreeNode(values[2*index+2],null,null);
            traverse(root.right, values, 2*index+2);
        }
    }

}
