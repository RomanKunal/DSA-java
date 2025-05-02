package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class InsertionBeforeTail {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        Node node=convert(arr);
        printList(node);
        node=insertBeforeTail(node,10);
        printList(node);

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
    private static Node insertBeforeTail(Node head, int data) {
        if (head == null || head.next == null) {
            // Can't insert before tail if there's only one node or none
            return head;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next; // move to tail
        }

        Node tail = temp;
        Node prev = tail.prev;

        Node newNode = new Node(data, prev, tail);
        prev.next = newNode;
        tail.prev = newNode;

        return head;
    }


}
