

import java.util.*;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        TreeSet<Integer> unique = new TreeSet<Integer>();
        traverse(root, unique);
        int[] ret = new int[unique.size()];
        int c = 0;
        for(int i : unique) {
            ret[c] = i;
            c++;
        }
        return ret;
    }

    public void traverse(TreeNode root, TreeSet<Integer> unique) {
        if(root == null) {
        }else{
            traverse(root.left, unique);
            unique.add(root.info);
            traverse(root.right, unique);
        }
    }
}
