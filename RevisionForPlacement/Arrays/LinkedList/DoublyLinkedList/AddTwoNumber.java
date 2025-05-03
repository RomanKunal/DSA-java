package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class AddTwoNumber {
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
    static Node add(Node node1, Node node2) {
        int sum = 0;
        int carry = 0;
        Node head1 = node1;
        Node head2 = node2;
        Node dummynode = new Node(-1);
        Node current = dummynode;

        while (head1 != null || head2 != null) {
            sum = carry; // start with carry from previous iteration

            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }

            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            Node ans = new Node(sum % 10);
            carry = sum / 10;

            current.next = ans;
            current = current.next;
        }

        // if carry is left after the last addition
        if (carry > 0) {
            current.next = new Node(carry);
        }

        return dummynode.next;
    }
}
