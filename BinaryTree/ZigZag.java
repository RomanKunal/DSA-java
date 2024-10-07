package BinaryTree;
import java.util.*;
public class ZigZag {
    public static void main(String[] args) {

    }
    static List<List<Integer>> call(Node root){
        List<List<Integer>> result=new ArrayList<>();
        boolean flag=true;
        Queue<Node> queue=new LinkedList<>();
        if(root==null){
            return result;
        }
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> level=new ArrayList<>();
            for (int i = 0; i <size ; i++) {
                Node node=queue.poll();
                if(flag){
                    level.add(node.data);
                }
                else{
                    level.add(0,node.data);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            flag=!flag;
            result.add(level);
        }
        return result;
    }

}
