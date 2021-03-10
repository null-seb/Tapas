package offer.easy;

public class maxDepth {
    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.TreeLeft),maxDepth(root.TreeRight))+1;

    }
}
