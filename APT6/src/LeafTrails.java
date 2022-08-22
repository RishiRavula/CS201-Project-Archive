import java.util.*;

public class LeafTrails {
    public String[] trails(TreeNode tree) {
        TreeMap<Integer, String> sort = new TreeMap<Integer, String>();
        pathFinder(tree, "", sort);
        String [] ret = sort.values().toArray(new String[0]);
        return ret;
    }

    public void pathFinder(TreeNode tree, String path, TreeMap<Integer, String> sort) {
        if(tree == null) {
            return;
        }
        if(tree.left == null && tree.right == null) {
            sort.put(tree.info, path);
        }
        else{
            pathFinder(tree.left, path + "0", sort);
            pathFinder(tree.right, path + "1", sort);
        }
    }
}
