package BinaryTree;

public class SumOfPath {
    static int findmax(Node root,int[] max){
        if (root == null) {
            return 0;
        }

        // Recursively calculate the maximum path sum for the left and right subtree
        int leftsum = Math.max(0, findmax(root.left, max));
        int rightsum = Math.max(0, findmax(root.right, max));

        // Update the maximum sum found so far
        max[0] = Math.max(max[0], leftsum + rightsum + root.data);

        // Return the maximum gain from either left or right child plus the root's value
        return Math.max(leftsum, rightsum) + root.data;
    }
    static int maxPathSum(Node root) {
        int[] maxi = new int[]{Integer.MIN_VALUE};
        findmax(root, maxi);
        return maxi[0];
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        System.out.println(maxPathSum(root));
    }
}
