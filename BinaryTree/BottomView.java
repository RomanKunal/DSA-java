package BinaryTree;
import java.util.*;
public class BottomView {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);
        List<Integer> topView = call(root);
        System.out.println("Bottom Traversal: ");
        for (int node : topView) {
            System.out.print(node + " ");
        }
    }
    static List<Integer> call(Node root){
        // for ans
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        // Queue Declaration
        Queue<Pair<Node,Integer>> q=new LinkedList<>();
        // for map
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair<>(root,0));
        // bfs
        while(!q.isEmpty()){
            Pair<Node,Integer> pair=q.poll();
            Node node=pair.getKey();
            int val=pair.getValue();
            // put it in map
            map.put(val,node.data);
            //left check
            if(node.left!=null){
                q.add(new Pair<>(node.left,val-1));
            }
            if(node.right!=null){
                q.add(new Pair<>(node.right,val+1));
            }
        }
        for (int val:map.values()) {
            res.add(val);
        }
        return res;
    }
}
