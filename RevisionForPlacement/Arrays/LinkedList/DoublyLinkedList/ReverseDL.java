package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

import java.util.Stack;

public class ReverseDL {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7};
        Node node=convert(arr);
        printList(node);
        reverse(node);
        printList(node);
        node=reverseBySwap(node);
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
    private static void reverse(Node node){
        Node temp=node;
        Stack<Integer> st=new Stack<>();
        while (temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=node;
        while (temp!=null){
            temp.data=st.peek();
            st.pop();
            temp=temp.next;
        }
    }
    private static Node reverseBySwap(Node node) {
        Node temp = node;
        Node newHead = null;

        while (temp != null) {
            // Swap prev and next
            Node last = temp.prev;
            temp.prev = temp.next;
            temp.next = last;

            // Move to next node (which is now in prev)
            newHead = temp; // potential new head
            temp = temp.prev;
        }
        return node;
    }

}
