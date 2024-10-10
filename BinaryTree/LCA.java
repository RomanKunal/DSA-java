package BinaryTree;

public class LCA {
    public static void main(String[] args) {

    }
    static Node call(Node root,Node p,Node q){
        if(root==null || root==p || root==q){
            return root;
        }
        Node left=call(root.left,p,q);
        Node right=call(root.right,p,q);
        if(left==null){
            return right;
        } else if (right==null) {
            return left;
        }else{
            return root;
        }
    }
}
