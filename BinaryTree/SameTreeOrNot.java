package BinaryTree;

import java.util.*;

public class SameTreeOrNot {
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);

        // Node2
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);


    }
    static boolean check(Node p,Node q){
        List<Integer> res1=new ArrayList<>();
        List<Integer> res2=new ArrayList<>();
        res1=Preorder(p);
        res2=Preorder(q);
        if(res1==res2){
            return true;
        }
        return false;
    }
    static void preorder(Node root,List<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.data);
        preorder(root.left,arr);
        preorder(root.right,arr);
    }
    static List<Integer> Preorder(Node root){
        List<Integer> arr=new ArrayList<>();

        preorder(root,arr);
        return arr;
    }
}
