package BST;

public class ConstructBSTFromPreOrder {
    public static void main(String[] args) {

    }
    static TreeNode bstfrompreorder(int[] preorder ){
        return bst(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    static TreeNode bst(int[] A,int bound,int[] i){
        if(i[0]==A.length || A[i[0]]>bound){
            return null;
        }
        TreeNode root=new TreeNode(A[i[0]++]);
        root.left=bst(A,root.data,i);
        root.right=bst(A,bound,i);
        return root;
    }
}
