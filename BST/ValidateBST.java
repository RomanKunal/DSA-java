package BST;

public class ValidateBST {
    public static void main(String[] args) {

    }
    static boolean check(TreeNode root){
        return isvalid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    static boolean isvalid(TreeNode root,long min,long max){
        if(root==null){
            return true;
        }
        if(root.data<=min || root.data>=max){
            return false;
        }
        return isvalid(root.left,min,root.data) && isvalid(root.right,root.data,max);
    }
}
