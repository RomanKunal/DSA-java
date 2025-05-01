package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

import java.util.Arrays;

public class DeleteAtHead {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        Node node=convert(arr);
        node=delete(node);
        printList(node);
        int[] arr1={1,2,3,4,5};
        Node node1=convert(arr1);
        node1=deletetail(node1);
        printList(node1);

    }
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // for newline after list
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
    private static Node delete(Node node){
        if (node == null || node.next == null) {
            return null;  // empty list or only one node
        }

        Node temp = node;
        node = node.next;   // move head to next node
        node.prev = null;   // break link to old head
        temp.next = null;   // break old head's link to next node

        return node;        // return new head
    }
    private static Node deletetail(Node head){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node prev=temp.prev;
        prev.next=null;
        temp.prev=null;
        return head;
    }

}
