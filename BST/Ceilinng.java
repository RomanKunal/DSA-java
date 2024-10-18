package BST;

public class Ceilinng {
    public static void main(String[] args) {
        TreeNode node=new TreeNode(10);
        node.left=new TreeNode(5);
        node.right=new TreeNode(13);
        node.left.left=new TreeNode(3);
        node.left.right=new TreeNode(6);
        node.right.left=new TreeNode(11);
        node.right.right=new TreeNode(14);
        node.left.left.left=new TreeNode(2);
        node.left.left.right=new TreeNode(4);
        node.right.right.right=new TreeNode(9);
        System.out.println(call(node,8));
    }
    static int call(TreeNode root,int key){
        int ceil=-1;
        while(root!=null){
            if(root.data==key){
                ceil=root.data;
                return ceil;
            }
            if(root.data>key){
                ceil=root.data;
                root=root.left;
            }else{
                root=root.right;
            }
        }
        return ceil;

    }
}
