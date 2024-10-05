package BinaryTree;
class Node {
    int data;
    Node left;
    Node right;

    //constructor to initialize
    public Node(int key) {
        data = key;
        left = null;
        right = null;
    }
}
public class Representation {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        System.out.println(root);

    }
}
