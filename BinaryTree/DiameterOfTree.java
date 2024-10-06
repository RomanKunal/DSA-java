package BinaryTree;

public class DiameterOfTree {
    static int diameter=0;
    // height of tree
    static int maxheight(Node root){
        if(root==null){
            return 0;
        }
        int left=maxheight(root.left);
        int right=maxheight(root.right);
        return (1+Math.max(left,right));
    }
    // height of subtrees
    static int findmax(Node root){

        if(root==null){
            return 0;
        }
        int left=maxheight(root.left);
        int right=maxheight(root.right);
        diameter=Math.max(diameter,left+right);
        return (1+Math.max(left,right));
    }
    static int get(Node root){
        findmax(root);
        return diameter;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Get and print the diameter of the tree
        System.out.println("The diameter of the binary tree is: " + get(root));
    }

}
