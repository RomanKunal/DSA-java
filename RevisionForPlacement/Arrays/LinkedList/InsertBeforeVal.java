package RevisionForPlacement.Arrays.LinkedList;

public class InsertBeforeVal {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        Node node=convert(arr);
        insert(node,10,6);
        printList(node);

    }
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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
    private static Node insert(Node node, int element, int val) {
        if (node == null) {
            return new Node(element);
        }

        // Case: Insert before head
        if (node.data == val) {
            return new Node(element, node);
        }

        Node temp = node;
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node newnode = new Node(element, temp.next);
                temp.next = newnode;
                break;
            }
            temp = temp.next;
        }
        return node;
    }

}
