package BST;

public class Deletion {
    public static void main(String[] args) {

    }
    static TreeNode deletenode(TreeNode root,int key){
        if(root==null){
            return null;
        }
        if(root.data==key){
            return helper(root);
        }
        TreeNode dummy=root;
        while(root!=null){
            if(root.data>key){
                if(root.left!=null && root.left.data==key){
                    root.left=helper(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }else{
                if(root.right!=null && root.right.data==key){
                    root.right=helper(root.right);
                    break;
                }
                else{
                    root=root.right;
                }
            }
        }
        return dummy;
    }
    static TreeNode helper(TreeNode root){
        if(root.left==null){
            return root.right;
        } else if (root.right==null) {
            return root.left;
        }
        else{
            TreeNode rightchild=root.right;
            TreeNode lastchild=find(root.left);
            lastchild.right=rightchild;
            return root.left;
        }
    }
    static TreeNode find(TreeNode root){
        if(root.right==null){
            return root;
        }
        return find(root.right);
    }
}
