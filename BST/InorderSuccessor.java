package BST;

import com.sun.source.tree.Tree;

public class InorderSuccessor {
    public static void main(String[] args) {

    }
    static TreeNode call(TreeNode root,TreeNode p){
        TreeNode suc=null;
        while(root!=null){
            if(p.data>=root.data){
                root=root.right;
            }else{
                suc=root;
                root=root.left;
            }
        }
        return suc;
    }
}
