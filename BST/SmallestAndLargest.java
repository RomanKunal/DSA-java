package BST;

import java.util.Arrays;
import java.util.*;
public class SmallestAndLargest {
    public static void main(String[] args) {

    }
    static void inorder(TreeNode root,List arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    static List check(TreeNode root,int k){
        List res=new ArrayList<>();
        inorder(root,res);
        int klargest= (int) res.get(res.size()-k);
        int ksmall=(int) res.get(k-1);
        return Arrays.asList(klargest,ksmall);
    }

}
