package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class Reversal {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,9};
        Node node=convert(arr);
        printList(node);
        node=reverse(node);
        printList(node);
        System.out.println(check(node));
    }
    private static boolean check(Node node){
        Node temp=node;
        Node rev=reverse(node);
        while (temp!=null && rev!=null){
            if(temp.data!=rev.data){
                return false;
            }else{
                return true;
            }

        }
        return false;
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
    private static Node reverse(Node node){
        Node temp=node;
        Node prev=null;
        while (temp!=null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
