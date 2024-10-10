package BinaryTree;

import java.util.*;

public class RootToNodePath {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        List<Integer> res=checck(root,7);
        for (int i = 0; i < res.size(); ++i) {
            System.out.print(res.get(i));
            if (i < res.size() - 1) {
                System.out.print(" -> ");
            }
        }
    }
    static boolean getpath(Node root, List<Integer> arr,int x){
        if(root==null){
            return false;
        }
        arr.add(root.data);
        if(root.data==x){
            return true;
        }
        if(getpath(root.left,arr,x) || getpath(root.right,arr,x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }

    static List<Integer> checck(Node root,int b){
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        getpath(root,res,b);
        return res;
    }
}
