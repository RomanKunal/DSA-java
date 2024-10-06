package BinaryTree;

public class MaximumDepthOfTree {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(maxDepth(root));
    }
    static int maxDepth(Node root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return (1+Math.max(left,right));
    }
}
