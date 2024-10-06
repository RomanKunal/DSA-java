package BinaryTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
class Solution{
    public static List<List<Integer>> levelorder(Node root){
        // for storing answer
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        // for storing traversal
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> level=new ArrayList<>();
            for (int i = 0; i <size ; i++) {
                Node node=queue.poll();
                // adding level data
                level.add(node.data);
                // checking left
                if(node.left!=null){
                    queue.add(node.left);
                }
                // checkng right
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
public class LevelOrderTraversal {
    static void printList(List<Integer> list) {
        // Iterate through the
        // list and print each element
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Solution sol=new Solution();
        List<List<Integer>> result=sol.levelorder(root);
        System.out.println("Level Order Traversal of Tree:");

        // Printing the level order traversal result
        for (List<Integer> level : result) {
            printList(level);
        }
    }
}
