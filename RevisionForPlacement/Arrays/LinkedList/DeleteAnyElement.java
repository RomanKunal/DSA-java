package RevisionForPlacement.Arrays.LinkedList;

public class DeleteAnyElement {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        Node node=convert(arr);
        delete(node,6);
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
    private static Node delete(Node head,int element){
        if(head==null || head.next==null){
            return head;
        }
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            if(temp.data==element){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return temp;
    }

}
