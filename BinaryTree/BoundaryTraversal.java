package BinaryTree;
import java.util.*;
public class BoundaryTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List<Integer> result=printitem(root);
        printResult(result);

    }
    // TO CHECK LEAF NODE
    static boolean isleaf(Node root) {
        return ((root.left == null) && (root.right==null));
    }
    // LEFT BOUNDARY
    static void addleft(Node root,List<Integer> res){
        Node current=root.left;
        while(current!=null){
            // check if it is leaf node
            if(!isleaf(current)){
                res.add(current.data);
            }
            // move it left and right
            if(current.left!=null){
                current=current.left;
            }else{
                current=current.right;
            }
        }
    }
    // RIGHT BOUNDARY
    static void addright(Node root,List<Integer> res){
        Node current=root.right;
        List<Integer> temp=new ArrayList<>();
        while(current!=null){
            if(!isleaf(current)){
                temp.add(current.data);
            }
            // move
            if(current.left!=null){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        for (int i = temp.size()-1; i>=0 ; i--) {
            res.add(temp.get(i));
        }
    }
    // add leaves
    static void addeaves(Node root,List<Integer> res){
        if(isleaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left!=null){
            addeaves(root.left,res);
        }else{
            addeaves(root.right,res);
        }
    }
    // print
    static List<Integer> printitem(Node root){
        List<Integer> res =new ArrayList<>();
        if(root==null){
            return res;
        }
        if(!isleaf(root)){
            res.add(root.data);
        }
        addleft(root,res);
        addeaves(root,res);
        addright(root,res);
        return res;
    }
    static void printResult(List<Integer> result) {
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}

