package BinaryTree;
import java.util.*;
public class InorderTraversal {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        List<Integer> result=inOrder(root);
        System.out.print("Inorder Traversal: ");
        // Output each value in the
        // inorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();

    }
    static void inorder(Node root,List<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    static List<Integer> inOrder(Node root){
        List<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return arr;
    }
}