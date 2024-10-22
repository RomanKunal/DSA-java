package BST;
import java.util.*;
public class TwoSumBST {
    public static void main(String[] args) {

    }
    static void inorder(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    static List<Integer> res(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
    public boolean findTarget(TreeNode root, int k) {
        // Get the inorder traversal result, which is a sorted list
        List<Integer> ans = res(root);

        // Use two pointers to find if there exists a pair that sums to k
        int i = 0, j = ans.size() - 1;

        // Two pointer technique on the sorted list (from inorder traversal)
        while (i < j) {
            int sum = ans.get(i) + ans.get(j);

            if (sum == k) {
                return true;
            } else if (sum < k) {
                i++;  // Move left pointer to the right
            } else {
                j--;  // Move right pointer to the left
            }
        }
        return false; // No pair found
    }
}
