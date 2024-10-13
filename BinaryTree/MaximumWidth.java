package BinaryTree;
import java.util.*;
public class MaximumWidth {
    public static void main(String[] args) {

    }
    static int Width(Node root){
        if(root==null){
            return 0;
        }
        int ans=0;
        Queue<Pair<Node,Integer>> q=new LinkedList<>();
        q.offer(new Pair<>(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int min=q.peek().getValue();
            int first=0;
            int last = 0;
            for (int i = 0; i < size; i++) {
                int current=q.peek().getValue()-min;
                Node node=q.poll().getKey();
                if(i==0){
                    first=current;
                }
                if(i==size-1){
                    last=current;
                }
                if(node.left!=null){
                    q.add(new Pair<>(node.left,2*current+1));
                }
                if(node.right!=null){
                    q.add(new Pair<>(node.right,2*current+2));
                }
            }
            ans=Math.max(ans, (last - first) + 1);
        }
        return ans;
    }
}
