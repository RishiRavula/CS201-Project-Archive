
import java.util.*;

public class LeafCollector {
     ArrayList<String> list = new ArrayList<>();
     ArrayList<String> collection = new ArrayList<>();
    public String[] getLeaves(TreeNode tree) {
        while(tree.left!= null || tree.right!=null) {
            collectAndRemove(tree);
            collection.add(String.join(" ", list));
            list = new ArrayList<>();
        }
        collection.add(tree.info + "");
        return collection.toArray(new String[0]);
    }

    private boolean collectAndRemove(TreeNode root) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        if(collectAndRemove(root.left)) {
            list.add(root.left.info + "");
            root.left = null;
        }
        if(collectAndRemove(root.right)) {
            list.add(root.right.info + "");
            root.right = null;
        }
        return false;
    }
}
