package BinaryTree;

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }
    static boolean isbalanced(Node root){
        if(root==null){
            return true;
        }
        int leftheight=maxheight(root.left);
        int rightheight=maxheight(root.right);
        if(Math.abs(leftheight-rightheight)<=1 && isbalanced(root.left) && isbalanced(root.right)){
            return true;
        }
        return false;
    }
    static int maxheight(Node root){
        if(root==null){
            return 0;
        }
        int left=maxheight(root.left);
        int right=maxheight(root.right);
        return (1+Math.max(left,right));
    }
}
