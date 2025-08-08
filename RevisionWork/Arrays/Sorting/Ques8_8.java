package RevisionWork.Arrays.Sorting;
import java.util.*;
class NodeNew {
    int val;
    NodeNew next;
    NodeNew random;

    public NodeNew(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class Ques8_8 {
    public static void main(String[] args) {

    }
    public NodeNew copyRandomList(NodeNew head) {
        HashMap<NodeNew,NodeNew> map=new HashMap<>();
        NodeNew curr=head;
        while(curr!=null){
            map.put(curr,new NodeNew(curr.val));
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            NodeNew copy=map.get(curr);
            copy.next=map.get(curr.next);
            copy.random=map.get(curr.random);
            curr=curr.next;
        }
        return map.get(head);
    }
}
