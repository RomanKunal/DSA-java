package BinaryTree;
import java.util.*;
public class SerializeAndDeseriallize {
    public static void main(String[] args) {

    }
    static String serialize(Node root){
        if(root==null){
            return " ";
        }
        Queue<Node> q=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            Node node=q.poll();
            if(node==null){
                res.append("n");
                continue;
            }
            res.append(node.data+" ");
            q.add(node.left);
            q.add(node.right);
        }
        return res.toString();
    }
    static Node deserial(String str){
        if(str==" "){
            return null;
        }
        Queue<Node> q=new LinkedList<>();
        String[] val=str.split(" ");
        Node root=new Node(Integer.parseInt(val[0]));
        q.add(root);
        for (int i = 1; i < val.length; i++) {
            Node parent=q.poll();
            if(!val[i].equals("n")){
                Node left=new Node(Integer.parseInt(val[i]));
                parent.left=left;
                q.add(left);
            }
            if(!val[++i].equals("n")){
                Node right=new Node(Integer.parseInt(val[i]));
                parent.right=right;
                q.add(right);
            }
        }
        return root;
    }
}
