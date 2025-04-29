package RevisionForPlacement.Arrays.LinkedList;

public class DelFromTail {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        Node head = convert(arr);
        head = deleteFromTail(head);  // call the corrected function
        printList(head);              // helper function to verify result
    }

    private static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static Node deleteFromTail(Node head) {
        if (head == null || head.next == null) {
            return null; // if list is empty or has only one node
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next; // move to second last node
        }
        temp.next = null; // remove the last node
        return head;
    }

    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
