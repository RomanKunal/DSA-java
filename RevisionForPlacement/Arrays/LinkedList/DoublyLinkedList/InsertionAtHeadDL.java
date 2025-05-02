package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class InsertionAtHeadDL {
    public static void main(String[] args) {

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
    private static Node insert(Node head, int data) {
        Node newHead = new Node(data, null, head); // new node's next = current head
        if (head != null) {
            head.prev = newHead; // current head's prev = new node
        }
        return newHead; // new head of the list
    }

}
