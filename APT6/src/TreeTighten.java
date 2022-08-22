public class TreeTighten {
    public TreeNode tighten(TreeNode t) {
        if(t == null) {
            return null;
        }
        if(t.left == null && t.right == null) {
            return t;
        }
        if(t.left != null && t.right != null) {
            t.left = tighten(t.left);
            t.right = tighten(t.right);
            return t;
        }
        if(t.left != null) {
            t.left = tighten(t.left);
            return t.left;
        }else{
            t.right = tighten(t.right);
            return t.right;
        }
    }

}