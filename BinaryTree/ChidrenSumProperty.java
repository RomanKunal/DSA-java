package BinaryTree;

public class ChidrenSumProperty {
    public static void main(String[] args) {
        Node node=new Node(2);
        node.left=new Node(35);
        node.right=new Node(10);
        node.left.left=new Node(2);
        node.left.right=new Node(3);
        node.right.left=new Node(5);
        node.right.right=new Node(2);
        changetree(node);
        traversal(node);
    }
    static void changetree(Node root){
        if(root==null){
            return;
        }
        int child=0;
        if(root.left!=null){
            child+=root.left.data;
        }
        if(root.right!=null){
            child+=root.right.data;
        }
        if(child>root.data){
            root.data=child;
        }else{
            if(root.left!=null){
                root.left.data=root.data;
            } else if (root.right!=null) {
                root.right.data=root.data;
            }
        }
        changetree(root.left);
        changetree(root.right);
        int total=0;
        if(root.left!=null){
            total+=root.left.data;
        }
        if(root.right!=null){
            total+=root.right.data;
        }
        if(root.left!=null || root.right!=null){
            root.data=total;
        }
    }
    static void traversal(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+ " ");
        traversal(root.left);
        traversal(root.right);
    }
}
