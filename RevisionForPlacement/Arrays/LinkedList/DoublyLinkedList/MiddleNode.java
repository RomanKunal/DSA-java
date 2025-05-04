package RevisionForPlacement.Arrays.LinkedList.DoublyLinkedList;

public class MiddleNode {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node node=convert(arr);
        printList(node);
        node=middle(node);
        printList(node);
        node=middlebytoto(node);
        printList(node);
        node=deletemiddle(node);
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
    private static Node middle(Node node){
        Node temp=node;
        int count=0;
        //count the length
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        int middlenode=(count/2)+1;
        temp=node;
        while (temp!=null){
            middlenode=middlenode-1;
            if (middlenode==0){
                break;
            }
            temp=temp.next;
        }
        return temp;
    }
    private static Node middlebytoto(Node node){
        Node slow=node;
        Node fast=node;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private static Node deletemiddle(Node node){
        Node prev=null;
        Node slow=node;
        Node fast=node;
        while (fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return node;
    }
}
