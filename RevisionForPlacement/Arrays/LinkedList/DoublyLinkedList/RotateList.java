package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class RotateList {
    public static void main(String[] args) {

    }
    public static Node rotate(Node node,int k){
        Node temp=node;
        int len=length(node);
        k=k%len;
        if(k==0){
            return node;
        }
        int skip=len-k;
        for (int i = 1; i <skip ; i++) {
            temp=temp.next;
        }
        Node newHead=temp.next;
        temp.next=null;
        Node tail=node;
        while (tail.next!=null){
            tail=tail.next;
        }
        tail.next=node;
        return newHead;

    }
    static int length(Node node){
        int count=0;
        Node temp=node;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
