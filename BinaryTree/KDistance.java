package BinaryTree;
import java.util.*;
public class KDistance {
     static Map<Node , Node > parent=new HashMap<>();
     static List<Integer> atDist=new ArrayList<>();
    static List<Integer> distance(Node root,Node target,int k){
        populate(root);
        performDFS(target,k);
        return atDist;
    }
    static void performDFS(Node root,int k){
        Queue<Pair<Node,Integer>> q=new LinkedList<>();
        Set<Node> visited=new HashSet<>();
        q.offer(new Pair<>(root,0));
        while(!q.isEmpty()){
            Pair<Node,Integer> pair=q.remove();
            Node node=pair.getKey();
            if(visited.contains(node)){
                continue;
            }
            visited.add(node);
            int dist=pair.getValue();
            if(dist==k){
                atDist.add(node.data);
            }
            if(node.left!=null){
                q.offer(new Pair<>(node.left,dist+1));
            }
            if(node.right!=null){
                q.offer(new Pair<>(node.right,dist+1));
            }
            if(parent.get(node)!=null){
                q.offer(new Pair<>(parent.get(node),dist+1));
            }
        }
    }
    static void populate(Node root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            parent.put(root.left,root);
        }
        if(root.right!=null){
            parent.put(root.right,root);
        }
        populate(root.left);
        populate(root.right);
    }

    public static void main(String[] args) {

    }
}
