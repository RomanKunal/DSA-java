package BinaryTree;

public class SymmetricTraversal {
    public static void main(String[] args) {

    }
    static boolean isSymmetric(Node root){
        if(root==null){
            return true;
        }
        return ischeck(root.left,root.right);
    }
    static boolean ischeck(Node root1,Node root2){
        if(root1==null || root2==null){
            return (root1==root2);
        }
        return ((root1.data==root2.data)&&ischeck(root1.left,root2.right) && ischeck(root1.right,root2.left));
    }
}
