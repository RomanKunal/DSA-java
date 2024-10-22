package BST;
import java.util.*;
public class RecoverBST {
    public static void main(String[] args) {

    }
    static void recover(TreeNode root){
        List<Integer> arr=check(root);
        int first = -1, second = -1;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                if (first == -1) {
                    first = i; // First violation
                }
                second = i + 1; // Second violation (keep updating)
            }
        }

        // Swap the two incorrect values back in the tree
        swapNodes(root, arr.get(first), arr.get(second));

    }
    static void inorder(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    static List<Integer> check(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans;

    }
    static void swapNodes(TreeNode root, int first, int second) {
        if (root == null) {
            return;
        }

        if (root.data == first) {
            root.data = second;
        } else if (root.data == second) {
            root.data = first;
        }

        swapNodes(root.left, first, second);
        swapNodes(root.right, first, second);
    }


}
