package BinaryTree;
import java.security.KeyPair;
import java.util.*;
class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class TopViewOfBT {
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
        System.out.println("Vertical Traversal: ");
        for (int node : topView) {
            System.out.print(node + " ");
        }
    }
    static List<Integer> call(Node root){
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        // FOR STORING QUEUE VALUE
        Map<Integer,Integer> map=new TreeMap<>();
        // FOR BFS TRAVERSAL
        Queue<Pair<Node,Integer>> q=new LinkedList<>();
        q.add(new Pair<>(root,0));

        // apply bfs
        while(!q.isEmpty()){
            Pair<Node,Integer> nodes=q.poll();
            Node temp=nodes.getKey();
            int line= nodes.getValue();

            // put it in map
            if(!map.containsKey(line)){
                map.put(line,temp.data);
            }
            // left child
            if(temp.left!=null){
                q.add(new Pair<>(temp.left,line-1));
            }
            // right child
            if(temp.right!=null){
                q.add(new Pair<>(temp.right,line+1));
            }

        }
        for (int val:map.values()) {
            res.add(val);
        }
        return res;
    }
}
