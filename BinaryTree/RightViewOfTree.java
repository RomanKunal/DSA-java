package BinaryTree;
import java.util.*;
public class RightViewOfTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);
        List<Integer> res=getview(root);
        for (int value:res) {
            System.out.println(value+ " ");
        }
    }
   static void rightview(Node root,List<Integer> res,int level){
        if(root==null){
            return;
        }
        if(level==res.size()){
            res.add(root.data);
        }
        rightview(root.right,res,level+1);
        rightview(root.left,res,level+1);

   }
   static List<Integer> getview(Node root){
        List<Integer> res=new ArrayList<>();
        rightview(root,res,0);
        return res;
   }
}
