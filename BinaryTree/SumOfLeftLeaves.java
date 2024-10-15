package BinaryTree;

public class SumOfLeftLeaves {
    static int leaf(Node root){
        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null){
                sum+=root.left.data;
            }else{
                sum+=leaf(root.left);
            }
        }
        sum+=leaf(root.right);
        return sum;
    }
}
