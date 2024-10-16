package BinaryTree;
import java.util.*;
public class UniqueBinaryTree {
    public static void main(String[] args) {

    }
    public Node buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        Node root=buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    static Node buildtree(int[] preorder,int prestart,int preEnd,int[] inorder,int instart,int inend,Map<Integer,Integer> map){
        if(prestart>preEnd || instart>inend){
            return null;
        }
        Node root=new Node(preorder[prestart]);
        int inroot=map.get(root.data);
        int numleft=inroot-instart;
        root.left=buildtree(preorder,prestart+1,prestart+numleft,inorder,instart,inroot-1,map);
        root.right=buildtree(preorder,prestart+numleft+1,preEnd,inorder,inroot+1,inend,map);
        return root;
    }
}
