package offer.easy;

class TreeNode{
    int val;
    TreeNode TreeLeft;
    TreeNode TreeRight;
    TreeNode(int x){
        val=x;
    }
}

class SolutionMirrorTree{
    public  TreeNode mirrorTree(TreeNode root){
        if(root==null)
            return null;

        TreeNode rootLeft=mirrorTree(root.TreeRight);
        TreeNode rootRight=mirrorTree(root.TreeLeft);

        root.TreeLeft=rootLeft;
        root.TreeRight=rootRight;
        return root;
    }
}
