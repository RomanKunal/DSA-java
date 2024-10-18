package BST;

import org.w3c.dom.Node;

public class Search {
    public static void main(String[] args) {
        TreeNode node=new TreeNode(8);

    }
    static TreeNode search(TreeNode root,int target){
        while(root!=null && root.data!=target){
            if(root.data>target){
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return root;
    }
}
