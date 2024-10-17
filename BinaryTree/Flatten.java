package BinaryTree;

public class Flatten {
    public static void main(String[] args) {

    }
    Node prev=null;
    public void flatten(Node root) {
        if(root==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=prev;
        root.left=null;
        prev=root;

    }
}
