

import java.util.*;

public class TreeSort {
    ArrayList<Integer> totalSort = new ArrayList<Integer>();

    public int[] sort(TreeNode tree) {
        traverse(tree);
        Collections.sort(totalSort);
        int[] returnSort = new int[totalSort.size()];
        for(int i = 0; i < returnSort.length;i++) {
            returnSort[i] = totalSort.get(i);
        }
        return returnSort;
    }

    public void traverse(TreeNode tree) {
        if(tree != null) {
            traverse(tree.left);
            totalSort.add(tree.info);
            traverse(tree.right);
        }
    }
}
