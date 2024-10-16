package BinaryTree;
import java.util.*;
public class UniqueTreeFromInandPost {
    public static void main(String[] args) {

    }
    public Node buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        Node root = buildtree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
        return root;
    }

    static Node buildtree(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend, Map<Integer, Integer> map) {
        if (poststart > postend || instart > inend) {
            return null;
        }
        // Get the root element from the postorder's last element
        int rootVal = postorder[postend];
        Node root = new Node(rootVal);

        // Find the root's index in the inorder array
        int eleIndex = map.get(rootVal);
        int numsleft = eleIndex - instart;

        // Recursively build the left and right subtrees
        root.left = buildtree(inorder, instart, eleIndex - 1, postorder, poststart, poststart + numsleft - 1, map);
        root.right = buildtree(inorder, eleIndex + 1, inend, postorder, poststart + numsleft, postend - 1, map);

        return root;
    }
}
