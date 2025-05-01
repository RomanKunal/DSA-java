package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class DeleteNode {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3};
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
    private static Node delete(Node node,int element){
        Node temp=node;
        if(temp==null){
            return null;
        }
        if (temp.data == element) {
            Node next = temp.next;
            if (next != null) {
                next.prev = null;
            }
            temp.next = null;
            return next; // return new head
        }
        while(temp.next!=null){
            if(temp.data==element) {
                Node prev = temp.prev;
                Node next = temp.next;
                if (next == null) {
                    prev.next = null;
                } else {
                    prev.next = next;
                    next.prev = prev;
                }
                temp.prev = null;
                temp.next = null;
                break;
            }
            temp=temp.next;
        }
        return node;
    }
}
