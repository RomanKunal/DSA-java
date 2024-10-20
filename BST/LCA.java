package BST;

import com.sun.source.tree.Tree;

public class LCA {
    public static void main(String[] args) {

    }
    static TreeNode check(TreeNode root, TreeNode p,TreeNode q){
        if(root==null){
            return null;
        }
        int current=root.data;
        if(current <p.data && current <q.data){
            return check(root.right,p,q);
        }
        if(current>p.data && current>q.data){
            return check(root.left,p,q);
        }
        return root;
    }
}
