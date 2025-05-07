package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;
import java.util.*;
public class MergeKList {
    public static void main(String[] args) {

    }
    public Node mergeKLists(Node[] lists) {
        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.data, b.data)
        );
        for (Node node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        Node dummy=new Node(0);
        Node temp=dummy;
        while(!pq.isEmpty()){
            Node smallest=pq.poll();
            temp.next=smallest;
            temp=temp.next;
            if(smallest.next!=null){
                pq.add(smallest.next);
            }
        }
        return dummy.next;


    }
}
