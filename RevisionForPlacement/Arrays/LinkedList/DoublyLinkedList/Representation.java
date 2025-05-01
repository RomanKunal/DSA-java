package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data,Node prev,Node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class Representation {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        Node node=convert(arr);
        System.out.println(node.next.next.next.data);

    }
    private static Node convert(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for (int i = 1; i < arr.length; i++) {
            Node temp=new Node(arr[i],prev,null);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
}
