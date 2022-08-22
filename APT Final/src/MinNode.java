import java.util.*;
public class MinNode {
    private  HashMap<Integer, String> p = new HashMap<>();
    ArrayList<Integer> values = new ArrayList<Integer>();

    public String locate(TreeNode root){
        storeKeyValues(root);
        int minimum = minNum(values);
        String ret = path(root,minimum);

        return ret;
    }

//USING FIND PATHS CODE
    private String path(TreeNode root, int target) {
        if (root == null) return null;

        pathing(root, "");
        if (p.get(target) == null){
            return "nopath";
        }
        return p.get(target);
    }
    public void pathing(TreeNode root, String path) {
        if (root == null) return;
        p.putIfAbsent(root.info, path);
        if (p.containsKey(root.info) && path.length() < p.get(root.info).length()) {
            p.put(root.info, path);
        }
        pathing(root.left, path + "0");
        pathing(root.right, path + "1");
    }

    private void treeTravel(TreeNode node) {
        if (node != null) {
            treeTravel(node.left);
            values.add(node.info);
            treeTravel(node.right);
        }
    }
    private ArrayList<Integer> storeKeyValues(TreeNode root) {
        treeTravel(root);
        return values;
    }
    private int minNum(ArrayList<Integer> values){
        int min = Integer.MAX_VALUE;
        for(int i : values){
            if(i < min);
            min = i;
        }
        return min;
    }
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

}

