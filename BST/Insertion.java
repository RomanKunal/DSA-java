package BST;

public class Insertion {
    public static void main(String[] args) {

    }
    static TreeNode call(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode cur=root;
        while (true){
            if(cur.data<=val){
                if(cur.right!=null){
                    cur=cur.right;
                }
                else{
                    cur.right=new TreeNode(val);
                    break;
                }
            }else{
                if(cur.left!=null){
                    cur=cur.left;
                }else{
                    cur.left=new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
