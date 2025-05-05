package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

import java.util.HashMap;

public class DetectALoop {
    public static void main(String[] args) {

    }
    private static boolean detect(Node node){
        Node temp=node;
        HashMap<Node,Boolean> map=new HashMap<>();
        while (temp!=null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,true);
            temp=temp.next;
        }
        return false;
    }
    private static boolean detecthare(Node node){
        Node slow=node;
        Node fast=node;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
