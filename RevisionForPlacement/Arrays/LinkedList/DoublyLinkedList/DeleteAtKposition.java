package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class DeleteAtKposition {
    public static void main(String[] args) {
        int[] arr={24,6,8,9};
        Node node=convert(arr);
        printList(node);
        node=delete(node,2);
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
    private static Node delete(Node node, int k) {
        int count = 1; // Start from 1 since head is position 1

        if (node == null) {
            return null;
        }

        // Case 1: delete head
        if (k == 1) {
            Node next = node.next;
            if (next != null) {
                next.prev = null;
            }
            node.next = null;
            return next;
        }

        Node temp = node;

        while (temp != null) {
            if (count == k) {
                Node prev = temp.prev;
                prev.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = prev;
                }
                temp.prev = null;
                temp.next = null;
                break;
            }
            temp = temp.next;
            count++;
        }

        return node;
    }

}
